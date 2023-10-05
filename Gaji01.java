import java.util.Scanner;

public class Gaji01{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int Gaji, potGaji;
        System.out.println("Masukkan jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=sc.nextInt();
        System.out.println("Masukkan jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk=sc.nextInt();
        System.out.println("Masukkan jumlah Gaji Kerja Anda ");
        Gaji=sc.nextInt();
        System.out.println("Masukkan jumlah Potongan Gaji Kerja Anda ");
        potGaji=sc.nextInt();
        TotGaji=(jmlMasuk*Gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang Diterima Adalah " + TotGaji);


    }
}
