package C.Operator;
import java.util.Scanner;
public class A_Jumlah {
    public static void main(String args[]){
        Scanner masuk=new Scanner(System.in);
        int A,B,jumlah;
        System.out.print("Bilangan 1: ");
        A=masuk.nextInt();
        System.out.print("Bilangan 2: ");
        B=masuk.nextInt();
        jumlah=A+B;
        System.out.print("Jumlah = "+jumlah);
        
    }
}
