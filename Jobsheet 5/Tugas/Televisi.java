package Tugas;

public class Televisi extends Elektronik {
    private int ukuranLayar;
    private String resolusi;
    private String tipeLayar;

    public Televisi(String merek, String model, int dayaListrik, int ukuranLayar, String resolusi, String tipeLayar) {
        super(merek, model, dayaListrik);
        this.ukuranLayar = ukuranLayar;
        this.resolusi = resolusi;
        this.tipeLayar = tipeLayar;
    }

    public void gantiKanal() {
        System.out.println("Mengganti kanal pada " + merek + " " + model + " dengan resolusi " + resolusi);
    }
}


