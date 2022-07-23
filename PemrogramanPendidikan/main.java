package PemrogramanPendidikan;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("1234567890");
        m.setNama("Adi");
        System.out.println("NIM: " + m.getNim());
        System.out.println("Nama: " + m.getNama());
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama Mahasiswa 1: ");
        mahasiswa1.nama=scan.nextLine();
        System.out.println("Masukkan Nama Mahasiswa 2: ");
        mahasiswa2.nama=scan.nextLine();
        System.out.println("Masukkan Nama Mahasiswa 3: ");
        mahasiswa3.nama=scan.nextLine();
        System.out.println("BELAJAR CLASS DAN OBJEK");
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa3.nama);
    }
}
