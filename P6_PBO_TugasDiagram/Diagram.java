package TugasDiagram;

public class Diagram {
    // Method default yang nantinya akan di-override oleh kelas anak
    public double hitungLuas() {
        System.out.println("Menghitung luas bangun datar...");
        return 0;
    }

    public double hitungKeliling() {
        System.out.println("Menghitung keliling bangun datar...");
        return 0;
    }
}