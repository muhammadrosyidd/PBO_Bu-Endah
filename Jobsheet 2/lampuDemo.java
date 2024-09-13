public class lampuDemo {
    public static void main(String[] args) {
        lampu l1 = new lampu();
        l1.merk = "Tosiba";
        l1.type = "led";
        l1.warna = "Putih";
        l1.kecerahan = 0;

        l1.displayInfo();
        System.out.println("Setelah DI setting");

        l1.tambahKecerahan(120);
        l1.setWarna("Kuning");

        l1.displayInfo();

        System.out.println("--------------------");

        lampu l2 = new lampu();
        l2.merk = "Sharp";
        l2.type = "led";
        l2.warna = "Merah";
        l2.kecerahan = 90;

        l2.displayInfo();
        System.out.println("Setelah DI setting");

        l2.kurangiKecerahan(20);
        l2.setWarna("Biru");

        l2.displayInfo();
    }
}
