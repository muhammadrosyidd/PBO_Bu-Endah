package Percobaan4;

public class InheritaceDemo {
    
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama= "Yanay Ayuningtyas";
        dosen1.nip="34329837";
        dosen1.gaji =3000000;
        dosen1.nidn="1989432439";

        System.out.println(dosen1.getAllInfo());
    }
}
