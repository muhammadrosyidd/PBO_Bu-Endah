package Percobaan4;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(){
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getAllInfo(){
        String info = "";
        info += "NIP        : " + super.nip + "\n";
        info += "Nama       : " + super.nama + "\n";
        info += "Gaji       : " + super.gaji + "\n";
        info += "NIDN       : " + this.nidn + "\n";

        return info;
    }
}
