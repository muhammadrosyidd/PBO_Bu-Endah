package Percobaan7;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip,String nama, double gaji,String nidn){
        super(nip,nama,gaji);
        this.nidn = nidn;
        
    }

    public String getInfo(){
        return "NIDN        : "+this.nidn+"\n";
    }
    public String getAllInfo(){
        String info = super.getInfo();
        info += super.getInfo();

        return info;
    }
}
