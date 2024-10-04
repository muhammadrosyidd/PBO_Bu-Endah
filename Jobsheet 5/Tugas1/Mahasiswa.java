package Tugas1;

public class Mahasiswa extends Data {
    public String nim;

    public Mahasiswa() {
        System.out.println("Objek Mahasiswa dibuat");
    }

    public Mahasiswa(String nama, String jeniskelamin, int umur, String nim) {
        super(nama, jeniskelamin, umur);
        this.nim = nim;
    }

    public String getInfoMhs() {
        return "NIM        : " + this.nim + "\n";
    }

    public String getAllmhs() {
        String info = super.getInfo();
        info += this.getInfoMhs();

        return info;
    }
}
