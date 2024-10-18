package Soal3;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc; 

    
    public int get_User_id() {
        return user_id;
    }

    public String get_password() {
        return password;
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public String get_email() {
        return email_id;
    }

    public String show_documents() {
        return doc;
    }

    // Setter Method untuk mengedit isi dari atribut yang telah dideklarasikan
    public void edit_profile(int user_id, String password, String name, int age, String email_id) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        
    }
}
