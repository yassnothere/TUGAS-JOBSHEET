import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in); 
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = input01.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = input01.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = input01.nextInt();
            input01.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input01.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
