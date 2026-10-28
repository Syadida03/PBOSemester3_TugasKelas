package P2_PBOKelasTugas;

import java.util.Scanner;

public class Tugas2PBO_Flowchart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jam, menit, detik, totalDetik;

        System.out.print("Masukkan Jam   : ");
        jam = input.nextInt();
        System.out.print("Masukkan Menit : ");
        menit = input.nextInt();
        System.out.print("Masukkan Detik : ");
        detik = input.nextInt();

        totalDetik = (jam * 3600) + (menit * 60) + detik;

        System.out.println("Total Detik: " + totalDetik);
    }
}
