public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;
    private int kecepatanMax = 100;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isIsMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // validasi nilai kecepatan terhadap status mesin
    public void setKecepatan(int kecepatanBaru) {
        if (isMesinOn) {
            if (kecepatanBaru > kecepatanMax) {
                System.out.println("Kecepatan tidak boleh melebihi " + kecepatanMax + " km/jam");
                this.kecepatan = kecepatanMax;
            } else if (kecepatanBaru < 0) {
                this.kecepatan = 0;
            } else {
                this.kecepatan = kecepatanBaru;
            }
        } else {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
    }

    // Method untuk menampilkan status motor
    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("======================");
    }
}
