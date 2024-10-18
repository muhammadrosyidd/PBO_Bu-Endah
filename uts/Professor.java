public class Professor extends Karyawan {
    protected double salary;

    public Professor(String name, String phoneNumber, String emailAddress, int employeeId, String department,
            double salary) {
        super(name, phoneNumber, emailAddress, employeeId, department);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void professorInfo() {
        System.out.println("Nama        : " + getName());
        System.out.println("Nomor Hp    : " + getPhoneNumber());
        System.out.println("Email       : " + getEmailAddress());
        System.out.println("Id Karyawan : " + getIdKaryawan());
        System.out.println("Departemen  : " + getDepartemen());
        System.out.println("Salary      : " + getSalary());
    }

}