package Tugas1;

public class Data {
    public String nama;
    public String jenisKelamin;
    public int umur;

    public Data(){
        System.out.println("Objek Data dibuat");
    }

    public Data(String nama,String jenisKelamin,int umur){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getInfo(){
        String info = "";
        info += "Nama       : "+nama+"\n";
        info += "Kelamin    : "+jenisKelamin+"\n";
        info += "Umur       : "+umur+"\n";

        return info;
    }
}
