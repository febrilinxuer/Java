package PemrogramanPendidikan;
public class Mahasiswa {
    public String nim,nama,alamat;
    private int nilai;
    public void setNim(String nim){
        this.nim=nim;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public void setNilai(int nilai){
        this.nilai=nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getNilai() {
        return nilai;
    }
    
}
