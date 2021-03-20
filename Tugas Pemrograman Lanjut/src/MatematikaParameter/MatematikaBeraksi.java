package MatematikaParameter;

public class MatematikaBeraksi {
    public static void main(String[]args){
       Matematika getJumlah = new Matematika();
       
       getJumlah.pertambahan(20,20);
       System.out.println("Pertambahan 20+20=" + getJumlah.getHasil());
       
       getJumlah.pengurangan(10,5);
       System.out.println("Pengurangan 10-5=" + getJumlah.getHasil());
       
       getJumlah.perkalian(10,20);
       System.out.println("Perkalian 10+20=" + getJumlah.getHasil());
       
       getJumlah.pembagian(21,2);
       System.out.println("Pembagian 21/2=" + getJumlah.getHasil());
    }
}
