package A.Network;
import java.net.*;
import java.io.*;
public class Client {
    public final String HOST = "localhost";
    public final int PORT = 443;
    
    public void kirim(){//methode kirim(client)
        try{
            //langkah 1: menciptakan objek socket
            Socket socket = new Socket (HOST, PORT);
            
            //langkah 2: Menciptakan output stream
            PrintWriter outStream = new PrintWriter(socket.getOutputStream(), true);
            
            //langkah 3 menciptakan input stream
            BufferedReader inStream = new BufferedReader(new InputStreamReader (socket.getInputStream()));
            
            //langkah 4 melakukan proses I/O
            String dataKeluar = "Percobaan";
            
            System.out.println("Mengirim string " + dataKeluar + " ke server");
            
            System.out.println(dataKeluar);
            
            String dataMasuk = inStream.readLine();
            System.out.println("Menerima string "+dataMasuk + " dari server");
            
            //langkah 5: Menutup objek socket
            socket.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e);
            System.exit(1);
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Client abc = new Client();
        abc.kirim();
    }
}
