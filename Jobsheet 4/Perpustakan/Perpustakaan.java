package Perpustakan;
import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private ArrayList<Buku> bukuDimiliki;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.bukuDimiliki = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void addBook(Buku buku){
        bukuDimiliki.add(buku);
    }

    public void getBukuAda(){
        if (bukuDimiliki.isEmpty()){
            System.out.println("Tidak ada buku tersedia di Perpustakaan "+nama);
        } else {
            System.out.println("--------------------------");
            System.out.println("Perpustakaan "+nama);
            System.out.println("--------------------------\n");
            System.out.println("Daftar Buku tersedia: ");
            for (Buku buku : bukuDimiliki){
                System.out.println(buku.info());
            }
        }
    }
}