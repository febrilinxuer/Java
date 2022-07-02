package E.Perulangan;
import java.util.Scanner;
public class B_UlangWhile2 {
    public static void main(String args[]){
        Scanner imprt=new Scanner(System.in);
        int bil=2;
        while(bil<=10){
            System.out.println(bil);
            bil+=2;
        }
        
        //tugas di latihan
        System.out.println("\ntugas di latihan(Ubah program di atas untuk menampilkan bilangan ganjil saja yaitu 1,3,5,7,9)");
        int bilawl, bilakhr;
        System.out.print("Masukkan angka awal bilangan: ");
        bilawl=imprt.nextInt();
        System.out.print("Masukkan angka akhir bilangan: ");
        bilakhr=imprt.nextInt();
        while(bilawl<=bilakhr){
            System.out.println(bilawl);
            bilawl+=2;
        }
        
        //dengan inputan if
        if (bilawl==1) {
            while(bilawl<=bilakhr){
                System.out.println(bilawl);
                bilawl+=2;
            }
        }
        else if (bilakhr==11) {
            while(bilawl<=bilakhr){
                System.out.println(bilawl);
                bilawl+=2;
            }
        }
    }
}
