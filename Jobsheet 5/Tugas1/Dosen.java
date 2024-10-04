package Tugas1;

public class Dosen extends Data {
    public String nidn;

    public Dosen() {
        System.out.println("Objek Dosen dibuat");

    }

    public Dosen(String nama, String jeniskelamin, int umur, String nidn) {
        super(nama, jeniskelamin, umur);
        this.nidn = nidn;
    }

    public String getInfoDsn() {
        return "NIDN       : " + this.nidn + "\n";
    }

    public String getAllDosen() {
        String info = super.getInfo();
        info += this.getInfoDsn();

        return info;
    }
}