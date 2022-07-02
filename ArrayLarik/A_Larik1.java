package F.ArrayLarik;
import java.util.Scanner;
public class A_Larik1 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        float nilai[]=new float[5];
        
        System.out.println("Masukkan 5 buah data nilai");//isiannya array nilai[] diregister di perulangan for. *dilakukan demikian karena tetap akan bisa teregister isiannya.
        for (int i = 0; i < 5; i++) {
            System.out.print("Data ke"+(i+1)+": ");
            nilai[i]=scn.nextFloat();
        }
        
        System.out.println("data nilai yang dimasukkan");
        for (int a = 0; a < 5; a++) 
            System.out.println(nilai[a]);//array sudah ada isiannya meskipun memakai variabel int yang berbeda
        
    }
}

class PenjumlahanArray{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
//        int pembagian[]; //deklarasi array dalam bentuk yang dipecah
//        pembagian= new int[2];
        System.out.print("Masukkan banyak data array: ");
        int bykdt1=scn.nextInt();
        int penjumlahan[]=new int[bykdt1];
        for (int i = 0; i < bykdt1; i++) {
            System.out.print("Masukkan nilai yang ingin dijumlahkan: ");
            penjumlahan[i]=scn.nextInt();
        }
    }
}
