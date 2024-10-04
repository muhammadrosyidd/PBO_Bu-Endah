package Perpustakan;
import java.time.LocalDate;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        Penulis penulis1 = new Penulis("Tere Liye", LocalDate.of(1992, 6, 12));
        Penulis penulis2 = new Penulis("Roxc", LocalDate.of(1995, 8,1));

        Buku buku1 = new Buku("Hujan", "Fantasy", penulis1, LocalDate.ofYearDay(2004, 12));
        Buku buku2 = new Buku("api", "Fantasy", penulis1, LocalDate.ofYearDay(2004, 12));
        Buku buku3 = new Buku("Avengers", "Fantasy", penulis2, LocalDate.ofYearDay(2005, 12));

        Perpustakaan perpustakaan = new Perpustakaan("Pusat");
        
        perpustakaan.addBook(buku1);
        perpustakaan.addBook(buku2);
        perpustakaan.addBook(buku3);

        perpustakaan.getBukuAda();

        penulis1.getBukuDitulis();
        penulis2.getBukuDitulis();
        
    }
}
