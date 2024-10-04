package Tugas;

public class Elektronik {
    protected String merek;
    protected String model;
    protected int dayaListrik;

    public Elektronik(String merek, String model, int dayaListrik) {
        this.merek = merek;
        this.model = model;
        this.dayaListrik = dayaListrik;
    }

    public void hidupkanTV() {
        System.out.println("TV "+merek + " " + model + " sedang dihidupkan.");
    }

    public void matikanTV() {
        System.out.println("TV "+merek + " " + model + " sedang dimatikan.");
    }
    public void hidupkanLaptop() {
        System.out.println("Laptop "+merek + " " + model + " sedang dihidupkan.");
    }

    public void matikanLaptop() {
        System.out.println("Laptop "+merek + " " + model + " sedang dimatikan.");
    }
}
