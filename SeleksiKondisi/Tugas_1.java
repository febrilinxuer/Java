package D.SeleksiKondisi;
import java.util.Scanner;
public class Tugas_1 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a,b,c,D;
        System.out.print("Masukkan nilai a:");
        a=scn.nextInt();
        System.out.print("Masukkan nilai b:");
        b=scn.nextInt();
        System.out.print("Masukkan nilai c:");
        c=scn.nextInt();
        D=b*b-(4*a*c);
        System.out.println("Nilai D(Determinan) adalah: "+D);
        if (D==0) {
            System.out.println("Akar Kembar");
        }        
        else if (D>=0) {
            System.out.println("Akar Beda");
        }
        else if (D<=0) {
            System.out.println("Akar Imajiner");
        }
    }
}
