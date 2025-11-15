
import java.util.Random;

public class MergeSort {
// fungsi merge

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        //salin data ke array sementara
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        //gabungkan dua bagian
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //jika masih ada sisa elemen di L
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        //jika masih ada sisa elemen di R
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // fungsi mergeSort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // program utama
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 10;
        int[] arr = new int[size];

        //generate angka acak
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); //angka acak antara 0-99
        }

        System.out.println("sebelum diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\n\nSetelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
