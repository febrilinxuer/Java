package C.Operator;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int b1, b2, j, kr, kl, bg, sisa;
        
        System.out.print("Bilangan 1 : ");
        b1=scan.nextInt();
        System.out.print("Bilangan 2 : ");
        b2=scan.nextInt();
        
        j=b1+b2;
        kr=b1-b2;
        kl=b1*b2;
        bg=b1/b2;
        sisa=bg%2;
        
        System.out.println("\nHasil Operator Aritmatika\n"
                + "=============================");
        System.out.println("Jumlah = "+j);
        System.out.println("Kurang = "+kr);
        System.out.println("Kali = "+kl);
        System.out.println("Bagi = "+bg);
        System.out.println("Sisa = "+sisa);
    }    
}
