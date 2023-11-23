import java.util.Scanner;

public class Ucapan_01 {
    
    public static String PenerimaUcapan() {
        Scanner input01 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri Ucapan :");
        String namaOrang = input01.nextLine();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }
}
