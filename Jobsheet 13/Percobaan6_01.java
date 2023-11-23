import java.util.Scanner;

public class Percobaan6_01 {
    //public static void main(String[] args) {
        //Scanner input01 = new Scanner(System.in);

        //int p,l,t,L,vol;

        //System.out.println("Masukkan panjang :");
        //p = input01.nextInt();
        //System.out.println("Masukkan lebar :");
        //l = input01.nextInt();
        //System.out.println("Masukkan Panjang :");
        //t = input01.nextInt();

        //L =  p*l;
        //System.out.println("Luas Persegi panjang adalah :" + L);

        //vol = p*l*t;
        //System.out.println("Volume balok adalah :" +vol);
        
    // Fungsi hitungLuas
    public static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    // Fungsi hitungVolume
    public static int hitungVolume (int tinggi, int a,int b){
        int Volume =  hitungLuas(a, b)*tinggi;
        return Volume;
    }
    // Fungsi main
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang :");
        p = input01.nextInt();
        System.out.print("Masukkan lebar :");
        l = input01.nextInt();
        System.out.print("Masukkan Tinggi :");
        t = input01.nextInt();
        
        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah :" + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah :" +vol);
    }
}
