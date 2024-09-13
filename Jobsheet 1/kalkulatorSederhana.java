import java.util.Scanner;

public class kalkulatorSederhana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan 1: ");
        int Bilangan1 = input.nextInt();
        System.out.print("Masukkan Bilangan 2: ");
        int Bilangan2 = input.nextInt();
        System.out.print("Masukkan Operator(+,-,*,%,/): ");
        char operator = input.next().charAt(0);

        int HasilKalkulasi = Kalkulasi(operator, Bilangan1, Bilangan2);
        System.out.println("Hasilnya adalah: " + HasilKalkulasi);
    }

    static int Kalkulasi(char operator, int Bilangan1, int Bilangan2) {
        int hasil = 0;
        switch (operator) {
            case '%':
                hasil = Bilangan1 % Bilangan2;
                break;
            case '/':
                hasil = Bilangan1 / Bilangan2;
                break;
            case '*':
                hasil = Bilangan1 * Bilangan2;
                break;
            case '-':
                hasil = Bilangan1 - Bilangan2;
                break;
            case '+':
                hasil = Bilangan1 + Bilangan2;
                break;
            default:
                System.out.println("Operasi tidak tersedia!");
        }
        return hasil;
    }
}