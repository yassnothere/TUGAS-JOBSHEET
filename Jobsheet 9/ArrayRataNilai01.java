import java.util.Scanner;
public class ArrayRataNilai01 {
  public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int [] nilaiMhsw = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhsw.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhsw [i] = input01.nextInt();
        }

        for (int i = 0; i < nilaiMhsw.length; i++) {
            total += nilaiMhsw[i];
        }
        
        rata2 = total/nilaiMhsw.length;
        System.out.println("Rata-rata nilai = " + rata2);
    }
}
