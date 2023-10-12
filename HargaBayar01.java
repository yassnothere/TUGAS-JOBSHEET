import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class HargaBayar01{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String merkBuku; 
        int jmlHalBuku;
        int harga, jumlah;
        double dis=0.1, total, bayar, jmlDis;
        System.out.println("Masukkan Nama Barang yang Dibeli ");
        merkBuku=sc.nextLine();
        System.out.println("Masukkan Jumlah Halaman Buku yang Dibeli ");
        jmlHalBuku=sc.nextInt();
        System.out.println("Masukkan Harga Barang yang Dibeli ");
        harga=sc.nextInt();
        System.out.println("Masukkan Jumlah Barang yang Dibeli");
        jumlah=sc.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang Anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayarkan adalah " + bayar);
        
    }
}