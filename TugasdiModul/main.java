package TugasdiModul;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
//        Mahasiswa ujian = new Mahasiswa();
//        ujian.setNim("1234567890");
//        ujian.setNama("Adi");
//        ujian.setNilai_tugas(70);
//        ujian.setNilai_uts(80);
//        ujian.setNilai_uas(75);
//        System.out.println("NIM\t\t: " + ujian.getNim());
//        System.out.println("Nama\t\t: " + ujian.getNama());
//        System.out.println("Nilai Tugas\t: " + ujian.getNilai_tugas());
//        System.out.println("Nilai UTS\t: " + ujian.getNilai_uts());
//        System.out.println("Niali UAS\t: " + ujian.getNilai_uas());
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa\t: ");
        mahasiswa1.nim = scan.nextLine();
        System.out.print("Maukkan nama Mahasiswa\t: ");
        mahasiswa1.nama = scan.nextLine();
        System.out.print("Masukkan nilai tugas\t: ");
        mahasiswa1.nilai_tugas = scan.nextDouble();
        System.out.print("Masukkan nilai UTS\t: ");
        mahasiswa1.nilai_uts = scan.nextDouble();
        System.out.print("Masukkan nilai UAS\t: ");
        mahasiswa1.nilai_uas = scan.nextDouble();
        System.out.println("Rata-rata Nilai Akhir\t: ");
        mahasiswa1.Nilai_akhir();
        System.out.print("Nilai Akhir\t\t: ");
        mahasiswa1.konv_nilai();
        System.out.print("Ketentuan isi Mahasiswa\t: ");
        mahasiswa1.isLulus();
    }
    
}
