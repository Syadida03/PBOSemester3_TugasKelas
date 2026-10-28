package TugasDiagram;

public class Segitiga extends Diagram {
    double alas;
    double tinggi;
    double sisiA;
    double sisiB;
    double sisiC;

    // Konstruktor untuk luas dan keliling
    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}