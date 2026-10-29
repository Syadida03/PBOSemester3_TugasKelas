package P5_PBO_TugasConstructor;

public class Buku {
    public static void main(String[] args) {
        // 1. Menguji Constructor tanpa parameter (kemungkinan 1)
        Buku buku1 = new Buku();
        System.out.println("--- Informasi Buku 1 (Default) ---");
        buku1.tampilkanInfo();
        System.out.println();

        // 2. Menguji Constructor dengan 1 parameter (Judul saja)
        Buku buku2 = new Buku("Belajar Pemrograman Java");
        System.out.println("--- Informasi Buku 2 (Judul Saja) ---");
        buku2.tampilkanInfo();
        System.out.println();

        // 3. Menguji Constructor lengkap (Judul, Pengarang, Tahun Terbit)
        Buku buku3 = new Buku("Pemrograman Berorientasi Objek", "Lalan Jaelani", 2026);
        System.out.println("--- Informasi Buku 3 (Lengkap) ---");
        buku3.tampilkanInfo();
    }

    private void tampilkanInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

// Class Buku dengan Constructor Overloading untuk menangani berbagai kemungkinan
class Buku {
    // Atribut (Instance Variables)
    String judul;
    String pengarang;
    int tahunTerbit;

    // 1. Constructor tanpa parameter (jika data belum diketahui)
    public Buku() {
        judul = "Belum diisi";
        pengarang = "Tidak diketahui";
        tahunTerbit = 0;
    }

    // 2. Constructor dengan parameter judul saja
    public Buku(String judul) {
        this.judul = judul;
        this.pengarang = "Anonim";
        this.tahunTerbit = 2026;
    }

    // 3. Constructor dengan parameter lengkap (judul, pengarang, tahun terbit)
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul Buku   : " + judul);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}