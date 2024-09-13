public class persegiPanjang {
    public int panjang;
    public int lebar;

    public int getKeliling(){
        return 2* (panjang+lebar);
    }

    public int getLuas(){
        return panjang*lebar;
    }

    public void displayInfo(){
        System.out.println("Panjang      : "+panjang);
        System.out.println("Lebar        : "+lebar);
        System.out.println("Keliling     : "+getKeliling());
        System.out.println("Luas         : "+getLuas());
    }
}
