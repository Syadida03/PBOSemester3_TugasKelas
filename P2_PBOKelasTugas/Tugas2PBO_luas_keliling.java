package P2_PBOKelasTugas;
import java.util.Scanner;

public class Tugas2PBO_luas_keliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float jari, keliling, luas;
        final float phi = 3.14f;

        System.out.print("Masukkan Jari-jari: ");
        jari = input.nextFloat();

        luas = phi * jari * jari;
        keliling = 2 * phi * jari;

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);

    }
}
