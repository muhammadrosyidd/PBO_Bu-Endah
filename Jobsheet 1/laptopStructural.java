public class laptopStructural {

    
    public static int VolumeUp(int volume, int increment) {
        volume += increment;
        if (volume >= 10) {
            volume = 10;
        }
        return volume;
    }

    
    public static int VolumeDown(int volume, int decrease) {
        volume -= decrease;
        if (volume <= 0) {
            volume = 0;
        }
        return volume;
    }

    
    public static void bukaAplikasi(int[] statusBaterai) {
        for (int i = 0; i < statusBaterai.length; i++) {
            statusBaterai[i] -= 10;
            if (statusBaterai[i] < 0) {
                statusBaterai[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        
        String merk1, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        String warna1, warna2, warna3, warna4, warna5, warna6, warna7, warna8, warna9, warna10;
        int volume1, volume2, volume3, volume4, volume5, volume6, volume7, volume8, volume9, volume10;
        int statusBaterai1, statusBaterai2, statusBaterai3, statusBaterai4, statusBaterai5, statusBaterai6, statusBaterai7, statusBaterai8, statusBaterai9, statusBaterai10;

        
        merk1 = "Asus";
        warna1 = "Hitam";
        volume1 = 10;
        statusBaterai1 = 100;

        merk2 = "Lenovo";
        warna2 = "Biru";
        volume2 = 3;
        statusBaterai2 = 90;

        merk3 = "Acer";
        warna3 = "Hitam";
        volume3 = 3;
        statusBaterai3 = 80;

        merk4 = "Asus";
        warna4 = "Merah";
        volume4 = 3;
        statusBaterai4 = 70;

        merk5 = "Asus";
        warna5 = "Silver";
        volume5 = 3;
        statusBaterai5 = 60;

        merk6 = "Asus";
        warna6 = "Hitam";
        volume6 = 3;
        statusBaterai6 = 50;

        merk7 = "Asus";
        warna7 = "Hitam";
        volume7 = 3;
        statusBaterai7 = 40;

        merk8 = "Lenovo";
        warna8 = "Ungu";
        volume8 = 3;
        statusBaterai8 = 30;

        merk9 = "Asus";
        warna9 = "Hitam";
        volume9 = 3;
        statusBaterai9 = 20;

        merk10 = "Acer";
        warna10 = "Hitam";
        volume10 = 3;
        statusBaterai10 = 10;


        volume1 = VolumeDown(volume1, 6);
        volume2 = VolumeUp(volume2, 7);
        volume3 = VolumeDown(volume3, 7);
        volume4 = VolumeUp(volume4, 8);
        volume5 = VolumeUp(volume5, 2);
        volume6 = VolumeDown(volume6, 3);
        volume7 = VolumeDown(volume7, 5);
        volume8 = VolumeUp(volume8, 10);
        volume9 = VolumeDown(volume9, 7);
        volume10 = VolumeUp(volume10, 5);
        

        int[] statusBaterai = {statusBaterai1, statusBaterai2, statusBaterai3, statusBaterai4, statusBaterai5, statusBaterai6, statusBaterai7, statusBaterai8, statusBaterai9, statusBaterai10};
        bukaAplikasi(statusBaterai);

        
        System.out.println("Merk: " + merk1);
        System.out.println("Warna: " + warna1);
        System.out.println("Volume: " + volume1);
        System.out.println("Status Baterai: " + statusBaterai[0] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk2);
        System.out.println("Warna: " + warna2);
        System.out.println("Volume: " + volume2);
        System.out.println("Status Baterai: " + statusBaterai[1] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk3);
        System.out.println("Warna: " + warna3);
        System.out.println("Volume: " + volume3);
        System.out.println("Status Baterai: " + statusBaterai[2] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk4);
        System.out.println("Warna: " + warna4);
        System.out.println("Volume: " + volume4);
        System.out.println("Status Baterai: " + statusBaterai[3] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk5);
        System.out.println("Warna: " + warna5);
        System.out.println("Volume: " + volume5);
        System.out.println("Status Baterai: " + statusBaterai[4] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk6);
        System.out.println("Warna: " + warna6);
        System.out.println("Volume: " + volume6);
        System.out.println("Status Baterai: " + statusBaterai[5] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk7);
        System.out.println("Warna: " + warna7);
        System.out.println("Volume: " + volume7);
        System.out.println("Status Baterai: " + statusBaterai[6] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk8);
        System.out.println("Warna: " + warna8);
        System.out.println("Volume: " + volume8);
        System.out.println("Status Baterai: " + statusBaterai[7] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk9);
        System.out.println("Warna: " + warna9);
        System.out.println("Volume: " + volume9);
        System.out.println("Status Baterai: " + statusBaterai[8] + "%");
        System.out.println("---------------------");
        System.out.println("Merk: " + merk10);
        System.out.println("Warna: " + warna10);
        System.out.println("Volume: " + volume10);
        System.out.println("Status Baterai: " + statusBaterai[9] + "%");
        System.out.println("---------------------");
    }
}
