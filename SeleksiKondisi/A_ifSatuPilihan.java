package D.SeleksiKondisi;
import java.util.Scanner;

public class A_ifSatuPilihan {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int bil;
        System.out.print("Masukkan bilangan\t:");
        bil=scn.nextInt();
        if (bil==0){ 
            System.out.println("Bilangan Nol");
        }
        else
            System.out.println("Bilangan Bukan Nol");
    }    
}
