package TugasPraktikum;
import java.util.Scanner;
public class Buku extends Data{
    void inputdata1(){
        System.out.println("====================");
        System.out.print("Judul\t\t: ");
        judul=new Scanner(System.in).nextLine();
        System.out.print("Pengarang\t\t: ");
        pengarang=new Scanner(System.in).nextLine();
        System.out.print("Penerbit\t\t: ");
        penerbit=new Scanner(System.in).nextLine();
        System.out.print("Tahun terbit\t\t: ");
        tahunterbit=new Scanner(System.in).nextInt();
    }
    
}
