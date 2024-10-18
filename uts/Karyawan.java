public class Karyawan extends Person {
    private int idKaryawan;
    private String departemen;

    public Karyawan(String name, String phoneNumber, String emailAddress, int idKaryawan, String departemen) {
        super(name, phoneNumber, emailAddress);
        this.idKaryawan = idKaryawan;
        this.departemen = departemen;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

}
