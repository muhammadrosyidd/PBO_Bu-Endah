public class anggota {
    private String noKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public anggota(String noKTP, String nama, int limitPeminjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        // validasi pinjaman lebih dari 0
        if (jumlah > 0) {
            // validasi jumlah pinjaman tidak melebihi limit
            if ((jumlahPinjaman + jumlah) <= limitPeminjaman) {
                // tambah pinjaman
                jumlahPinjaman += jumlah;
            } else {
                System.out.println("Maaf, jumlah pinjaman melebihi limit.");
            }
        } else {
            System.out.println("Jumlah pinjaman harus lebih besar dari 0.");
        }
    }

    public void angsur(int jumlah) {
        // validasi jumlah angsuran lebih dari 0
        if (jumlah > 0) {
            // Kurangi pinjaman dengan jumlah angsuran
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) {
                // memastikan jumlah pijaman tidak k negatif
                jumlahPinjaman = 0;
            }
        } else {
            System.out.println("Jumlah angsuran harus lebih besar dari 0.");
        }
    }
}
