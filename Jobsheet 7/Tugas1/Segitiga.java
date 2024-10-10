package Tugas1;

class Segitiga {
    
    private int sudut;

    
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA; // Menghitung sudut ketiga
        return sudut;
    }

    
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB); // Menghitung sudut ketiga
        return sudut;
    }

    
    public double keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC; // Hitung keliling
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2)); // Menghitung sisi C
        return sisiA + sisiB + sisiC; // Menghitung keliling dengan sisi C meruapakn hasil dari akar a kuadrat + akar b kuadrat
    }
}

class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        
        int sudutA = 60;
        int sudutB = 70;
        int totalSudut1 = segitiga.totalSudut(sudutA);
        int totalSudut2 = segitiga.totalSudut(sudutA, sudutB);
        System.out.println("Total sudut untuk sudut A: " + totalSudut1);
        System.out.println("Total sudut untuk sudut A dan B: " + totalSudut2);

        
        int sisiA = 5, sisiB = 10, sisiC = 7;
        double keliling1 = segitiga.keliling(sisiA, sisiB, sisiC);
        double keliling2 = segitiga.keliling(sisiA, sisiB); 
        System.out.println("Keliling segitiga: " + keliling1);
        System.out.println("Keliling segitiga dengan sisi C double: " + keliling2);
    }
}
