package TugasPraktikum;
public class Data {
    String judul, pengarang, penerbit, kategoribuku;
    int tahunterbit, stokbuku;
    String Penulis, jurusan, fakultas, kategoriskripsi, statuspeminjaman;

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setKategoribuku(String kategoribuku) {
        this.kategoribuku = kategoribuku;
    }

    public void setKategoriskripsi(String kategoriskripsi) {
        this.kategoriskripsi = kategoriskripsi;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }

    public void setStatuspeminjaman(String statuspeminjaman) {
        this.statuspeminjaman = statuspeminjaman;
    }

    public void setStokbuku(int stokbuku) {
        this.stokbuku = stokbuku;
    }

    public void setTahunterbit(int tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getJudul() {
        return judul;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getKategoribuku() {
        return kategoribuku;
    }

    public String getKategoriskripsi() {
        return kategoriskripsi;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenulis() {
        return Penulis;
    }

    public String getStatuspeminjaman() {
        return statuspeminjaman;
    }

    public int getStokbuku() {
        return stokbuku;
    }

    public int getTahunterbit() {
        return tahunterbit;
    }
    
}
