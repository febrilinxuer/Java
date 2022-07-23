import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Mahasiswa ujian = new Mahasiswa();
        ujian.setNim("1234567890");
        ujian.setNama("Febri");
        ujian.setNilai_tugas(70);
        ujian.setNilai_uts(80);
        ujian.setNilai_uas(75);

        System.out.println("NIM\t\t: " + ujian.getNim());
        System.out.println("Nama\t\t: " + ujian.getNama());
        System.out.println("Nilai Tugas\t: " + ujian.getNilai_tugas());
        System.out.println("Nilai UTS\t: " + ujian.getNilai_uts());
        System.out.println("Niali UAS\t: " + ujian.getNilai_uas());
    }
}
