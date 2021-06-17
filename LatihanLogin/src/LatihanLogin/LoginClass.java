package LatihanLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LoginClass {
     private Connection LoginClass;
    
    public Connection connect(){
     try{
    Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Koneksi Berhasil");
    } catch (ClassNotFoundException ex){
            System.out.println("Koneksi Gagal" + ex);
    }
    String url = "jdbc:mysql://localhost:3306/latihanlogin";
    try{
    LoginClass = DriverManager.getConnection(url, "root", "");
            System.out.println("Koneksi Ke Database Berhasil");
    } catch (SQLException ex){
            System.out.println("Koneksi Ke Database Gagal" + ex);
    }
    return LoginClass;
    }
}
