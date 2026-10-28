package Sepeda;
import java.util.Scanner;

// Class Utama
public class Sepeda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Object Merk Sepeda: ");
        String namaMerk = input.nextLine();

        SepedaBeraksi sepedaku = new SepedaBeraksi();
        sepedaku.merk = namaMerk;
        
        System.out.println("Object " + sepedaku.merk + " dibuat, jarak tempuh awal 0 km");

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    sepedaku.bergerakMaju(); 
                    break;
                case 2:
                    sepedaku.gerakMundur(); 
                    break;
                case 3:
                    sepedaku.berhenti();   
                    break;
                case 0:
                    System.out.println("Keluar Program .. Terimakasih sudah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        input.close();
    }
}

class SepedaBeraksi {
    String merk;
    int jarakTempuh = 0; 

    void bergerakMaju() {
        jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }

    void gerakMundur() {
        jarakTempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }

    void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh akhir " + jarakTempuh + " Km");
    }
}