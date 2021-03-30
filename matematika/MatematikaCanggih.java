
package inheritance.matematika;

public class MatematikaCanggih extends Matematika {
 void modulus (int a, int b){
        operasi = a % b;
        System.out.println("Hasil dari Modulus = "+ getOperasi());
    }

    // Method Integer Dengan 3 Parameter
    void modulus (int a, int b, int c){
        operasi = a % b % c;
        System.out.println("Hasil dari Modulus = "+ getOperasi());
    }

    // Method Double Dengan 2 Parameter
    void modulus (double a, double b) {
        Hitung = a % b ;
        System.out.println("Hasil dari Modulus = " + getHitung());
    }

    // Method Double Dengan 3 Parameter
    void modulus (double a, double b, double c) {
        Hitung = a % b % c;
        System.out.println("Hasil dari Modulus = " + getHitung());
    }   
}
