package LatihanConstrucktor;
public class manusia {
    String nama;
    int usia;    
    
    manusia (String nama, int usia){
    this.nama= nama;
    this.usia = usia;
    }
    void cetak(){
        System.out.println("Nama : "+nama);
        System.out.println("Usia : "+usia+"\n");
    }
}
