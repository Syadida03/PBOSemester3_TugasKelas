package P5_PBO_TugasConstructor;

public class Mobil {
    String merek;
    String model;
    int tahun;

    // Constructor 1: dengan 2 parameter (merek & model), tahun default 2025
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
        this.tahun = 2025; // Nilai default sesuai instruksi
    }

    // Constructor 2: dengan 3 parameter (merek, model, & tahun)
    public Mobil(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    // Method untuk mencetak hasil
    void tampilkanMobil() {
        System.out.println("Merek : " + merek + ", Model : " + model + ", Tahun : " + tahun);
    }
}

class MainTugas2 {
    public static void main(String[] args) {
        // Membuat objek dengan constructor 2 parameter
        Mobil mobil1 = new Mobil("Toyota", "Avanza");
        
        // Membuat objek dengan constructor 3 parameter
        Mobil mobil2 = new Mobil("Honda", "Civic", 2024);

        // Cetak hasilnya
        mobil1.tampilkanMobil();
        mobil2.tampilkanMobil();
    }
}
