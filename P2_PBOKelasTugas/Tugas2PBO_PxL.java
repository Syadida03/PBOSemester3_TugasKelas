package P2_PBOKelasTugas;

import java.util.Scanner;
        
public class Tugas2PBO_PxL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float panjang, lebar, luas;

        System.out.print("Masukkan Panjang : ");
        panjang = input.nextFloat();

        System.out.print("Masukkan Lebar   : ");
        lebar = input.nextFloat();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang : " + luas);

    }
}
