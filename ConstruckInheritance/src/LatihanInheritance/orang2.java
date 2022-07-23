package LatihanInheritance;

public class orang2 {
    private String nama;
    private double tinggi;
    private double berat;
    
    public orang2 (String nama, double tinggi, double berat){
        this.nama=nama;
        this.tinggi=tinggi;
        this.berat=berat;    
    }
    public String toString(){
        return ("Nama : " + nama + "\nTinggi : " + tinggi + "\nBerat :" + berat);
    }
}

class mahasiswa1 extends orang2{
    private String nim;
    private String univAsal;
    private double nilai;
    
    public mahasiswa1 (String nama, double tinggi, double berat, String nim, String univAsal, double nilai){
        super (nama, tinggi, berat);
        this.nim=nim;
        this.univAsal=univAsal;
        this.nilai=nilai;
    }
    public String toString(){
        return (super.toString() + "\nNIM : " + nim + "\nUniversitas Asal : " + univAsal + "\nNilai : " + nilai);
    }
}

class siswa extends orang2{
    String nis;
    public siswa (String nama, double tinggi, double berat, String nis){
        super (nama, tinggi, berat);
        this.nis=nis;
    }
    
    public String toString(){
        return (super.toString() + "\nNIS : " + nis);
    }
}

class mahasiswalama extends mahasiswa{
    private double masastudi;
    public mahasiswalama (String nama, double tinggi, double berat, String nim, String univAsal, double nilai, double masastudi){
        super(nama, tinggi, berat, nim, univAsal, nilai);
        this.masastudi=masastudi;
    }
    public String toString(){
        return (super.toString()+"\nMasa Studi : "+masastudi);
    }
}
