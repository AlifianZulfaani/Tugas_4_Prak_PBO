/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasJDBC;
import java.sql.DriverManager;

/**
 *
 * @author MSI1
 */
public class Koneksi {
    private static java.sql.Connection connect;
    
    public static java.sql.Connection getConnect(){
        if (connect == null){
            try{
                String url = "jdbc:mysql://localhost/tugasjdbc";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connect = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            }catch (Exception exc){
                System.out.println("Koneksi Gagal");
            }
        }
        return connect;
    }
    
    public static void main(String args[]){
        getConnect();
    }
}
