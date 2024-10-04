package Tugas;

public class TugasDemo {
    public static void main(String[] args) {
   
        Laptop laptop1 = new Laptop("Lenovo", "Yoga 7I", 65, "Intel Core i5 EVO", 16, 512);
        laptop1.hidupkanLaptop();
        laptop1.jalankanProgram();
     
        laptop1.merek = "HP";
        laptop1.model = "Pavilion 14";
   
        System.out.println("Setelah modifikasi: " + laptop1.merek + " " + laptop1.model);
        laptop1.matikanLaptop();
        System.out.println("\n");


        Televisi tv = new Televisi("TCL", "QLED", 120, 55, "4K", "LED");
        tv.hidupkanTV();
        tv.gantiKanal();
    
        tv.merek = "Sony";
        tv.model = "Bravia";

        System.out.println("Setelah modifikasi: " + tv.merek + " " + tv.model);
        tv.matikanTV();
    }
}
