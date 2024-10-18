package Soal3;

public class Customer extends User {
    private boolean verification_status = false;

    public boolean get_verification_status() {
        return verification_status;
    }

    // Validasi dokumen sebelum verifikasi
    public void apply_verification(String doc) {
        if (isValidExtension(doc)) {
            this.verification_status = true;
            System.out.println("Verifikasi diterapkan dengan dokumen: " + doc);
        } else {
            System.out.println("Ekstensi file yang anda upload salah.Hanya .jpg, .png, .pdf yang bisa diterima.");
        }
    }

    // Cek apakah ekstensi file yang diupload valid
    private boolean isValidExtension(String doc) {
        String[] validExtensions = { ".jpg", ".png", ".pdf" };
        for (String ext : validExtensions) {
            if (doc.toLowerCase().endsWith(ext)) {
                return true;
            }
        }
        return false;
    }
}
