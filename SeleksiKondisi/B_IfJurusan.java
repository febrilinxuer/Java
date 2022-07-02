package D.SeleksiKondisi;
import java.util.Scanner;
        
public class B_IfJurusan {
    public static void main(String args[]){
        Scanner impt=new Scanner(System.in);
        String pil;
        System.out.print("Masukkan Pilihan : ");
        pil=impt.next();
        if (pil=="1") {
            System.out.println("Jurusan MI/D3");
        }
        else if (pil=="2") {
            System.out.println("Jurusan TK/D3");
        }
        else if (pil=="3") {
            System.out.println("Jurusan KA/D3");
        }
        else if (pil=="4") {
            System.out.println("Jurusan TI/S1");
        }
        else if (pil=="5") {
            System.out.println("Jurusan SI/S1");
        }
        else
            System.out.println("Pilihan Salah!!!");
        
//        switch (pil) {
//            case "1":
//                System.out.println("Jurusan MI/D3");
//                break;
//            case "2":
//                System.out.println("Jurusan TK/D3");
//                break;
//            case "3":
//                System.out.println("Jurusan KA/D3");
//                break;
//            case "4":
//                System.out.println("Jurusan TI/S1");
//                break;
//            case "5":
//                System.out.println("Jurusan SI/S1");
//                break;
//            default:
//                System.out.println("Pilihan Salah!!!");
//                break;
//        }
    }
}
