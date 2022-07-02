package E.Perulangan;
import java.util.Scanner;
public class Tugas_1 {
    public static void main(String args[]){
        Scanner ipt=new Scanner(System.in);
        int bykdta;        
        System.out.print("Masukkan banyak data : ");
        bykdta=ipt.nextInt();
        
        int isidta[]=new int[bykdta];
        
        for (int i = 0; i < bykdta; i++) {//register isi2 data array
            System.out.print("Data ke-"+(i+1)+" : ");
            isidta[i]=ipt.nextInt();
        }
        int jumlah=isidta[0]+isidta[1]+isidta[2]+isidta[3];
        System.out.println(jumlah/4);
        
//        int isiaray;
//        for (int a = 0; a < bykdta; a++) {//tampilkan isi data array
////            System.out.println(isidta[a]);
//            isiaray=isidta[a];
//            System.out.println(isiaray);
//        }
//        System.out.println(isidta[a]);
//        for (int i = 0; i < bykdta; i++) 
//            
//        
//        System.out.println(isidta[i]/bykdta);
        
    }
}
