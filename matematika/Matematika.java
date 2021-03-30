
package inheritance.matematika;

public class Matematika {
   int operasi;
    double Hitung;

    //2 Parameter
    void penjumlahan (int a, int b) {
        operasi = a + b;
        System.out.println("Hasil dari Penjumlahan = " + getOperasi());
    }

    void pengurangan(int a, int b) {
        operasi = a - b;
        System.out.println("Hasil dari Pengurangan = " + getOperasi());
    }

    void perkalian(int a, int b) {
        operasi = a * b;
        System.out.println("Hasil dari Perkalian = " + getOperasi());
    }

    void pembagian(int a, int b) {
        operasi = a / b;
        System.out.println("Hasil dari Pembagian = " + getOperasi());
    }

    // 3 Parameter
    void penjumlahan(int a, int b,int c) {
        operasi = a + b + c;
        System.out.println("Hasil dari Penjumlahan = " + getOperasi());
    }

    void pengurangan(int a, int b, int c) {
        operasi = a - b - c;
        System.out.println("Hasil dari Pengurangan = " + getOperasi());
    }

    void perkalian(int a, int b, int c) {
        operasi = a * b * c;
        System.out.println("Hasil dari Perkalian = " + getOperasi());
    }

    void pembagian(int a, int b, int c) {
        operasi = a / b / c;
        System.out.println("Hasil dari Pembagian = " + getOperasi());
    }

    int getOperasi() {
        return operasi;
    }

    // Method Double
    void pertambahan(double a, double b) {
        Hitung = a + b;
        System.out.println("Hasil dari Penjumlahan = " + getHitung());
    }

    void pengurangan(double a, double b) {
        Hitung = a - b;
        System.out.println("Hasil dari Pengurangan = " + getHitung());
    }

    void perkalian(double a, double b) {
        Hitung = a * b;
        System.out.println("Hasil dari Perkalian = " + getHitung());
    }

    void pembagian(double a, double b) {
        Hitung = a / b;
        System.out.println("Hasil dari Pembagian = " + getHitung());
    }

 //Double 3 Parameter
    void pertambahan(double a, double b, double c) {
        Hitung = a + b + c;
        System.out.println("Hasil Penjumlahan = " + getHitung());
    }

    void pengurangan(double a, double b, double c) {
        Hitung = a - b - c;
        System.out.println("Hasil Pengurangan = " + getHitung());
    }

    void perkalian(double a, double b, double c) {
        Hitung = a * b * c;
        System.out.println("Hasil Perkalian = " + getHitung());
    }

    void pembagian(double a, double b, double c) {
        Hitung = a / b / c;
        System.out.println("Hasil Pembagian= " + getHitung());
    }
    double getHitung() {
        return Hitung;
    }
}
