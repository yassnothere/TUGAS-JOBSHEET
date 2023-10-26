import java.util.Scanner;

public class Modif2ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int x, lulus = 0, tdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        x = input01.nextInt();
        int [] nilaiMhsw = new int[x];

        for (int i = 0; i < nilaiMhsw.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhsw [i] = input01.nextInt();

            if (nilaiMhsw[i] > 70) {
                lulus++;
                totalLulus += nilaiMhsw[i];

            } else {
                tdkLulus++;
                totalTdkLulus += nilaiMhsw[i];
            }
        }
        
        rataLulus = totalLulus/lulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);

        rataTdkLulus = totalTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai = " + rataTdkLulus);

    }
}


