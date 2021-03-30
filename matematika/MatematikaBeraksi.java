
package inheritance.matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // inisialisasi Pemanggilan Method
        MatematikaCanggih MTK = new MatematikaCanggih();

        System.out.println("Method Pertambahan");
        MTK.pertambahan(5.5, 15.2, 80.4);
        MTK.pertambahan(1, 7, 17);
        MTK.pertambahan(55, 66);
        MTK.pertambahan(3.14, 14.80);

        System.out.println("Method Pengurangan");
        MTK.pengurangan(88.2, 58.2, 6.5);
        MTK.pengurangan(50, 21, 64);
        MTK.pengurangan(60, 14);
        MTK.pengurangan(3.14, 3.3);

        System.out.println("Method Perkalian");
        MTK.perkalian(10.5, 22.2, 33.33);
        MTK.perkalian(55, 2, 10);
        MTK.perkalian(22, 33);
        MTK.perkalian(3.14, 2.9);

        System.out.println("Method Pembagian");
        MTK.pembagian(55, 2, 10);
        MTK.pembagian(5, 28, 15);
        MTK.pembagian(55, 3);
        MTK.pembagian(2.2, 4.1);

        System.out.println("Method Modulus");
        MTK.modulus(14.6, 12.7, 4.2);
        MTK.modulus(10, 20, 30);
        MTK.modulus(27, 14);
        MTK.modulus(3.14, 5.9);

    }
}
