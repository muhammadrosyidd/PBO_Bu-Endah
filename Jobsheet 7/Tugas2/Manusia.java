package Tugas2;

public class Manusia {
    
    public void bernapas() {
        System.out.println("Manusia bernapas");
    }

    
    public void makan() {
        System.out.println("Manusia makan");
    }
}

// Class Dosen yang mewarisi dari  class Manusia
class Dosen extends Manusia {
    // Mengoverride method makan
    @Override
    public void makan() {
        System.out.println("Dosen makan");
    }

    // Method tambahan untuk dosen
    public void lembur() {
        System.out.println("Dosen lembur");
    }
}


class Mahasiswa extends Manusia {
   
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur");
    }
}

