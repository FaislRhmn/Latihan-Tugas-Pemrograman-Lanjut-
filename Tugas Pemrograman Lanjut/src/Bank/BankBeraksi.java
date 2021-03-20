package Bank;

public class BankBeraksi {
  public static void main(String[]args){
      Bank XYZ = new Bank (100000);
      XYZ.saldo();
      XYZ.simpanUang (500000);
      XYZ.ambilUang (150000);
  }  
}
