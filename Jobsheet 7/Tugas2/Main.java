package Tugas2;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();      
        Manusia manusia2 = new Mahasiswa();    

        
        manusia1.bernapas();
        manusia2.bernapas();

        manusia1.makan(); 
        manusia2.makan(); 

        Dosen dosen = (Dosen) manusia1; 
        dosen.lembur();

        Mahasiswa mahasiswa = (Mahasiswa) manusia2; 
        mahasiswa.tidur();
    }
}
