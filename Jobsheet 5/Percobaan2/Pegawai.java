package Percobaan2;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }
    
    public String getInfo() {
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "Nama       : " + nama + "\n";
        info += "Gaji       : " + gaji + "\n";

        return info;
    }
}
