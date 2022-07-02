package A.Algoritma;
import java.util.Scanner;

public class Tugas3b {
    public static void main(String args[]){
        int a,b,c;
        double r;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input nilai pertama: ");
        a=scan.nextInt();
        System.out.print("Input nilai Kedua: ");
        b=scan.nextInt();
        System.out.print("Input nilai Ketiga: ");
        c=scan.nextInt();
        
        r=(a+b+c)/3;
        System.out.print("Hasil: "+r);
        
    }
}
//Jawaban tugas no. 1
//class bisa langsung dipanggil ke class lain
//Jawaban tugas no. 2
//VSCode