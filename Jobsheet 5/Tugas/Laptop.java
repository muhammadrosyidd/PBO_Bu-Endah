package Tugas;

public class Laptop extends Elektronik {
    // Atribut tambahan
    private String prosesor;
    private int ram;
    private int rom;

    public Laptop(String merek, String model, int dayaListrik, String prosesor, int ram, int rom) {
        super(merek, model, dayaListrik);
        this.prosesor = prosesor;
        this.ram = ram;
        this.rom = rom;
    }
    
    public void jalankanProgram() {
        System.out.println("Menjalankan program di " + merek + " " + model + " dengan prosesor " + prosesor);
    }
}
