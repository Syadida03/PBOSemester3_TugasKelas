package Sepeda;
import java.util.Scanner;

// 1. Ini adalah Class Utama tempat program dijalankan
public class Sepeda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input merk sepeda dari user
        System.out.print("Masukan Object Merk Sepeda: ");
        String namaMerk = input.nextLine();

        // INSTANTIATION: Membuat objek sepeda bernama 'sepedaku' dari Class SepedaBeraksi
        SepedaBeraksi sepedaku = new SepedaBeraksi();
        sepedaku.merk = namaMerk;
        
        System.out.println("Object " + sepedaku.merk + " dibuat, jarak tempuh awal 0 km");

        int pilihan;
        do {
            // Menampilkan Menu
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            // Percabangan berdasarkan menu yang dipilih
            switch (pilihan) {
                case 1:
                    sepedaku.bergerakMaju(); // Memanggil method maju
                    break;
                case 2:
                    sepedaku.gerakMundur(); // Memanggil method mundur
                    break;
                case 3:
                    sepedaku.berhenti();    // Memanggil method berhenti
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

// 2. Ini adalah Class Cetak Biru (Blueprint) Sepeda ditaruh di luar main
class SepedaBeraksi {
    // Atribut
    String merk;
    int jarakTempuh = 0; // Jarak awal 0 km sesuai soal

    // Method untuk bergerak maju (+10 km)
    void bergerakMaju() {
        jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }

    // Method untuk bergerak mundur (-5 km)
    void gerakMundur() {
        jarakTempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }

    // Method untuk berhenti
    void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh akhir " + jarakTempuh + " Km");
    }
}