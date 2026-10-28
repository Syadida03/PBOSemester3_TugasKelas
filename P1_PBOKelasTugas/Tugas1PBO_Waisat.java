package P1_PBOKelasTugas;

import java.util.Scanner;

public class Tugas1PBO_Waisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tahun;
        System.out.print("Masukan Tahun (1909 - 2024) : ");
        tahun = input.nextInt();

        // Tahun kabisat habis dibagi 4, tidak habis dibagi 100, habis dibagi 400)
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}
