public class Mahasiswa {
    public String nim,nama;
    public double nilai_tugas,nilai_uts,nilai_uas,NA;

    // set
    public void setNim(String nim){
        this.nim=nim;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNilai_tugas(double nilai_tugas){
        this.nilai_tugas=nilai_tugas;
    }
    public void setNilai_uts(double nilai_uts){
        this.nilai_tugas=nilai_tugas;
    }
    public void setNilai_uas(double nilai_uas){
        this.nilai_uas=nilai_uas;
    }
    
    // get
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public double getNilai_tugas(){
        return nilai_tugas;
    }
    public double getNilai_uts(){
        return nilai_uts;
    }
    public double getNilai_uas(){
        return nilai_uas;
    }

    void Nilai_akhir(){
        NA=(nilai_tugas*0.30)+(nilai_uts*0.30)+(nilai_uas*40);
    }

    void konv_nilai(){
        if (NA>=80) {
            System.out.println("A");
        } 
        else if (NA>=75) {
            System.out.println("B+");    
        }
        else if (NA>=70) {
            System.out.println("B");
        }
        else if (NA>=65) {
            System.out.println("C+");
        }
        else if (NA>=60) {
            System.out.println("C");
        }
        else if (NA>=55) {
            System.out.println("D+");
        }
        else if (NA>30) {
            System.out.println("D");
        }
        else if (NA<=30) {
            System.out.println("E");
        }
    }

    void Lulus(){
        if (NA>=80) {
            System.out.println("Lulus");
        }
        else if (NA>=75) {
            System.out.println("Lulus");
        }
        else if (NA>=70) {
            System.out.println("Lulus");
        }
        else if (NA>=65) {
            System.out.println("Lulus");
        }
        else if (NA>=60) {
            System.out.println("Lulus");
        }
        else if (NA>=55) {
            System.out.println("Tidak Lulus");
        }
        else if (NA>=30) {
            System.out.println("Tidak Lulus");
        }
        else if (NA<=30) {
            System.out.println("Tidak Lulus");
        }
    }
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
