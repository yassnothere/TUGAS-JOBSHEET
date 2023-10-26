   import java.util.Scanner;
public class Modif1ArrayNilai01 {
   public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        int [] nilaiAkhir = new int [10];

        for (int i = 1; i < nilaiAkhir.length ; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir [i] = input01.nextInt();
        }

        for (int i = 1; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " Lulus!");
            }
        }
    }
}
