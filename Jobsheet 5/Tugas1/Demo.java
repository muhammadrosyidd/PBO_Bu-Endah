package Tugas1;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Rosid", "Laki-Laki", 20, "1234");
        System.out.println(dosen1.getAllDosen());
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Roxc", "Perempuan", 19, "121");
        System.out.println(mahasiswa1.getAllmhs());
    }
}
