package Soal3;

public class User extends UserProfile {
    public boolean log_in(int user_id, String password) {

        System.out.println("Telah Login dengan User ID: " + user_id);
        return true;
    }

    public void recover_password() {

        System.out.println("Pemulihan Password dilakukan");
    }

    public void log_out() {

        System.out.println("Berhasil Logout");
    }
}
