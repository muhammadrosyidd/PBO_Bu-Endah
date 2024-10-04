package Perpustakan;

import java.time.LocalDate;

public class Buku {
    private String judul;
    private String genre;
    private Penulis penulis;
    private LocalDate tahunTerbit;

    public Buku(String judul, String genre, Penulis penulis, LocalDate tahunTerbit) {
        this.judul = judul;
        this.genre = genre;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.penulis.addBuku(this);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Penulis getPenulis(){
        return penulis;
    }

    public LocalDate getTahunTerbit(){
        return tahunTerbit;
     }

    public void setTahunTerbit (LocalDate tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public String info() {
        String header = String.format("| %-20s | %-15s | %-20s | %-15s |\n", 
                                      "Judul", "Genre", "Penulis", "Tahun Terbit");
        String separator = "+----------------------+-----------------+----------------------+-----------------+\n";
        String data = String.format("| %-20s | %-15s | %-20s | %-15s |\n", 
                                    judul, genre, penulis.getNama(), tahunTerbit);
    
        return separator + header + separator + data + separator;
    }
    
}
