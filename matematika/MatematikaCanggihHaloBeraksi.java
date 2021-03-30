
package inheritance.matematika;

public class MatematikaCanggihHaloBeraksi {
    public static void main(String[] args) {
        Matematika getHasil = new Matematika();
        MatematikaCanggih getHasil1 = new MatematikaCanggih();
        MatematikaCanggihHalo getHasil2 = new MatematikaCanggihHalo();

        getHasil.pertambahan(250,80);
        getHasil.perkalian(40,5);
        getHasil1.modulus(9,19);
        getHasil2.PertambahanTiga(5,20,80);
    }
}
