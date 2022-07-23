/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program.data.mahasiswa;

import com.mysql.jdbc.Driver;
import java.sql.*;

public class Koneksi {
    private static Connection connect;
    public static Connection getConnection() throws Exception{
        if (connect==null) {
            new Driver();
            connect=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tugasakhirbahaspemrograman_guidatabase","root","");
        }
        return connect;
    }
    public void show(){ //punyanya kelas login di paket
        System.out.println("Hallo Java");
    }
}
