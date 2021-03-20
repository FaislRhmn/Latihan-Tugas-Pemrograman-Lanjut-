package MatematikaParameter;

public class Matematika {
    int hasil;
    
    //Pertambahan
    void pertambahan (int a,int b){
        hasil = a + b;
    }
    //Pengurangan
    void pengurangan (int a,int b){
        hasil = a - b;
    }
    //Perkalian
    void perkalian (int a,int b){
        hasil = a*b;
    }
    //Pembagian
    void pembagian (int a,int b){
        hasil = a / b ;
    }
    int getHasil(){
        return hasil;
    }
}
