package Perpustakan;
import java.time.LocalDate;
import java.util.ArrayList;

public class Penulis {
    private String nama;
    private LocalDate tglLahir;
    private ArrayList<Buku> bukuDitulis;

    public Penulis(String nama,LocalDate tglLahir){
        this.nama = nama;
        this.bukuDitulis = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public LocalDate getTglLahir(){
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglahir){
        this.tglLahir=tglahir;
    }

    public void addBuku(Buku buku) {
        bukuDitulis.add(buku);
    }

    public void getBukuDitulis(){
        System.out.println("Nama Penulis: " + nama);
        for (Buku buku : bukuDitulis) {
            System.out.println(buku.info());
        }
    }
}
