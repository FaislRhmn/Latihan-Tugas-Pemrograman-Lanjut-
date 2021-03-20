package Bank;

public class Bank {
     int saldo,simpanUang,ambilUang;
    public Bank(int saldo){
        this.saldo = 100000;
    }
    void saldo(){
        System.out.println("Selamat datang di Bank XYZ");
        System.out.println("Saldo Anda saat ini:" + saldo);
    }
    void simpanUang(int simpanUang){
        saldo = saldo + simpanUang;
        System.out.println("Simpan Uang:" + simpanUang);
        System.out.println("Saldo Anda Saat ini:" + saldo);
    }
    void ambilUang(int ambilUang){
        saldo = saldo - ambilUang;
        System.out.println("Ambil Uang:" + ambilUang);
        System.out.println("Saldo anda saat ini:" + saldo);
    }
    int getsaldo(){
        return saldo;
    }
}
