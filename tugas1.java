
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class tugas1 {

    public static void main(String[] args) {
// Deklarasi tipe data

        int StrukturBaris = 0;
        String KataBaru = "Deklarasi tipe data String";
        int[] empatAngka = {7, 10, 20, 23};
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
        };
        LinkedList<Integer> listAngka = new LinkedList<>(List.of(22, 19, 44, 60, 72));

// Menampilkan output ke terminal
        for (String[] baris : Angka) {
            for (String kolom : baris) {
                System.out.print(kolom + " ");
            }
            System.out.println();
        }
        System.out.println(StrukturBaris);
        System.out.println(KataBaru);
        System.out.println(Arrays.toString(empatAngka));
        for (int angka : listAngka) {
            System.out.print(angka + " ");
        }
    }
}
