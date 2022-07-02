package F.ArrayLarik;
import java.util.Scanner;
public class B_ArrayDemo {
    public static void main(String args[]){
        int[] anArray;
        anArray=new int[10];
        
        anArray[2]=300;
        anArray[3]=400;
        anArray[4]=500;
        anArray[5]=600;
        anArray[6]=700;
        anArray[7]=800;
        anArray[8]=900;
        anArray[9]=1000;
        
        System.out.println("Element index 0:"+anArray[0]);
        System.out.println("Element index 1:"+anArray[1]);
        System.out.println("Element index 2:"+anArray[2]);
        System.out.println("Element index 3:"+anArray[3]);
        System.out.println("Element index 4:"+anArray[4]);
        System.out.println("Element index 5:"+anArray[5]);
        System.out.println("Element index 6:"+anArray[6]);
        System.out.println("Element index 7:"+anArray[7]);
        System.out.println("Element index 8:"+anArray[8]);
        System.out.println("Element index 9:"+anArray[9]);
        
        //pakai for dan scanner
        int bykary;
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan banyaknya data nilai : ");
        bykary=scan.nextInt();
        
        int isidta[]=new int[bykary];//isiannya ada di depan di "int isidta[]. sedangkan banyak data array ada di belakang di "new int[bykary]"
        for (int i = 0; i < bykary; i++) { //isian array hanya mau di panggil dari notasi 0 dan tidak mau kalau ada tanda kedua setelah tanda pertama, ex: "<" tidak mau "<="
            System.out.print("Data ke "+i+" : ");
            isidta[i]=scan.nextInt();
        }
        System.out.println("Isi data yang dimasukkan");//rule yg dibuat untuk byak array sama dengan rule isian array
        for (int i = 0; i < bykary; i++) {
            System.out.println(isidta[i]);
        }
    }
}
