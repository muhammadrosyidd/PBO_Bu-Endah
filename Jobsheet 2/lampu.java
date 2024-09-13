public class lampu {
    public String merk;
    public String type;
    public String warna;
    public int kecerahan;
    

    public void setWarna(String warnaBaru) {
        this.warna = warnaBaru;
    }

    public void tambahKecerahan(int increment) {
        kecerahan += increment;
        if (kecerahan >= 100) {
            kecerahan = 100;
        }

    }

    public void kurangiKecerahan(int decrement) {
        kecerahan -= decrement;
        if (kecerahan <= 0) {
            kecerahan = 0;
        }
    }

    public void displayInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Type         : " + type);
        System.out.println("Warna        : " + warna);
        System.out.println("Kecerahan    : " + kecerahan);
        
    }
}
