/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teknoko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Brahmasta Bagus A
 */
public class koneksi {
    Connection conn = null;
    public static Connection koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/teknoko";
        String user = "root";
        String pass = "";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(host,user,pass);
            System.out.println("Koneksi Berhasil");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Gagal "+e);
        }
        return null;
    }
}
