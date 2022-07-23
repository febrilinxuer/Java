package TugasdiModul;

public class Mahasiswa {
    public String nim, nama;
    public double nilai_tugas, nilai_uts, nilai_uas, NA;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai_tugas(double nilai_tugas) {
        this.nilai_tugas = nilai_tugas;
    }

    public void setNilai_uts(double nilai_uts) {
        this.nilai_uts = nilai_uts;
    }

    public void setNilai_uas(double nilai_uas) {
        this.nilai_uas = nilai_uas;
    }

    public void setNA(double NA) {
        this.NA = NA;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai_tugas() {
        return nilai_tugas;
    }

    public double getNilai_uts() {
        return nilai_uts;
    }

    public double getNilai_uas() {
        return nilai_uas;
    }

    public double getNA() {
        return NA;
    }
    
    void Nilai_akhir(){
        NA = (nilai_tugas * 0.30) + (nilai_uts * 0.30) + (nilai_uas * 0.40);
    }
    
    void konv_nilai(){
        if (NA >= 80 ) {
            System.out.println("A");
        }
        else if (NA >= 75) {
            System.out.println("B+");
        }
        else if (NA >= 70 ) {
            System.out.println("B");
        }
        else if (NA >= 65) {
            System.out.println("C+");
        }
        else if (NA >= 60) {
            System.out.println("C");
        }
        else if (NA >= 55) {
            System.out.println("D+");
        }
        else if (NA > 30) {
            System.out.println("D");
        }
        else if (NA <= 30){
            System.out.println("E");
        }
    }
    void isLulus(){
        if (NA >= 80 ) {
            System.out.println("Lulus");
        }
        else if (NA >= 75) {
            System.out.println("Lulus");
        }
        else if (NA >= 70 ) {
            System.out.println("Lulus");
        }
        else if (NA >= 65) {
            System.out.println("Lulus");
        }
        else if (NA >= 60) {
            System.out.println("Lulus");
        }
        else if (NA >= 55) {
            System.out.println("Tidak Lulus");
        }
        else if (NA > 30) {
            System.out.println("Tidak Lulus");
        }
        else if (NA <= 30){
            System.out.println("Tidak Lulus");
        }
    }
}