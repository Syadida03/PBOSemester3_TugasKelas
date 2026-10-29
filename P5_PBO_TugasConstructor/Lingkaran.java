package P5_PBO_TugasConstructor;

public class Lingkaran {
    double jariJari;

    // Constructor dengan validasi
    public Lingkaran(double jariJari) {
        if (jariJari <= 0) {
            this.jariJari = 1.0; // Nilai default jika <= 0
        } else {
            this.jariJari = jariJari;
        }
    }

    // Method untuk menghitung luas lingkaran (Luas = phi * r * r)
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    void tampilkanHasil() {
        System.out.println("Jari-jari : " + jariJari + " | Luas: " + hitungLuas());
    }
}

class MainTugas3 {
    public static void main(String[] args) {
        // Menguji berbagai input (normal, negatif, dan nol)
        Lingkaran lingkaran1 = new Lingkaran(7.0);   // Input normal
        Lingkaran lingkaran2 = new Lingkaran(-5.0);  // Input negatif (akan jadi 1.0)
        Lingkaran lingkaran3 = new Lingkaran(0.0);   // Input nol (akan jadi 1.0)

        lingkaran1.tampilkanHasil();
        lingkaran2.tampilkanHasil();
        lingkaran3.tampilkanHasil();
    }
}
