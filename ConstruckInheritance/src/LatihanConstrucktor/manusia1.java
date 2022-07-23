package LatihanConstrucktor;
public class manusia1 {
    String nama;
    int usia;
    
    manusia1(){
        this.nama="tanpa nama";
        this.usia=0;
    }

    manusia1(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    
    void cetak(){
        if(nama==null&&usia==0)
            return;
        System.out.println("Nama : "+nama);
        System.out.println("Usia : "+usia+"\n");
    }
}
