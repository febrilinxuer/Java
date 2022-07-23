package A.Network;
import java.net.*;
import java.io.*;

public class Server {
    public static final int PORT = 443;
    public void terima(){//methode terima(server)
        try{
            System.out.println("Menunggu request dari client");
            
            ServerSocket server = new ServerSocket(PORT);
            Socket clientSocket = server.accept();            
            
            BufferedReader inStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outStream = new PrintWriter(clientSocket.getOutputStream(), true);
            String data = inStream.readLine();
            
            System.out.println("Data dari client: "+data);
            System.out.println("Mengirim string DITERIMA ke client");
            
            outStream.println("DITERIMA");
            clientSocket.close();
        }catch(IOException e){
            System.err.println();
        }
    }
    
        public static void main(String[]args){//methode main
            Server xyz = new Server();
            xyz.terima();
        }
}
