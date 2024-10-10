public class Perkalianku {

    void perkalian(int a, int b){
        System.out.println(a * b);
    }

   
    void perkalian (double a, double b){
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        Perkalianku objek = new Perkalianku();

        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}