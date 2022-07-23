/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mahasiswa;

/**
 *
 * @author Febri
 */

import java.util.Scanner;

public class startUserInput {
    public static void main(String[] args) {
        Mahasiswa ujian = new Mahasiswa();
        ujian.setNim("1234567890");
        ujian.setNama("Febri");
        ujian.setNilai_tugas(70);
        ujian.setNilai_uts(80);
        ujian.setNilai_uas(75);
        
        System.out.println("NIM\t\t: "+ujian.getNim());
        System.out.println("Nama\t\t: "+ujian.getNama());
        System.out.println("Nilai Tugas\t: "+ujian.getNilai_tugas());
        System.out.println("Nilai UTS\t: "+ujian.getNilai_uts());
        System.out.println("Nilai UAS\t: "+ujian.getNilai_uas());
        
        Mahasiswa mahasiswa1=new Mahasiswa(); //panggil isi dan fungsi class Mahasiswa(yg digunakan) dengan buat onjek
        Scanner scan=new Scanner(System.in);  //panggil fungsi scan dengan buat objek
        
        System.out.print("Masukkan NIM Mahasiswa\t: ");
        mahasiswa1.nim=scan.nextLine();//panggil objek yg sudah dideklarasikan memakai isi clas(Mahasiswa) yang menggunakan fungsi scanner
        System.out.print("Masukkan Nama Mahasiswa\t: ");
        mahasiswa1.nama=scan.nextLine();
        System.out.print("Masukkan nilai Tugas\t: ");
        mahasiswa1.nilai_tugas=scan.nextDouble();
        System.out.print("Masukkan nilai UTS\t: ");
        mahasiswa1.nilai_uts=scan.nextDouble();
        System.out.print("Masukkan nilai UAS\t: ");
        mahasiswa1.nilai_uas=scan.nextDouble();
        
//        System.out.println("Rata-rata Nilai Akhir\t: ");
        mahasiswa1.Nilai_akhir();
        System.out.print("Nilai Akhir\t\t: ");
        mahasiswa1.konv_nilai();
        System.out.print("Ketentuan isi Mahasiswa\t: ");
        mahasiswa1.isLulus();
    }
}
