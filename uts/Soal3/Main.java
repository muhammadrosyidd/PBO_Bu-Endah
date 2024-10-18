package Soal3;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Customer----------");
        Customer customer = new Customer();
        customer.edit_profile(1, "123", "Rosyid", 30, "rosyidmuhammad@gmail.com");
        customer.log_in(1, "123");

        
        customer.apply_verification("image.jpg");

        customer.apply_verification("document.txt");//mencoba upload document dengan ekstensi selain yang disebutkan

        customer.log_out();

        customer.recover_password();

        System.out.println("-----------Admin-------------");
        Admin admin = new Admin();
        admin.add_vehicle();
        admin.update_vehicle_details(101);
        admin.verify_user(1);
        admin.retrieve_complains();
    } 
}
