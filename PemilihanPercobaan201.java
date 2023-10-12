import java.util.Scanner;

public class PemilihanPercobaan201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.print("Nilai UAS      : ");
        float UAS = input01.nextFloat();
        System.out.print("Nilai UTS      : ");
        float UTS = input01.nextFloat();
        System.out.print("Nilai Kuis     : ");
        float Kuis =  input01.nextFloat();
        System.out.print("Nilai Tugas    : ");
        float Tugas = input01.nextFloat();
        float total = ( UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);
        String message = total < 65 ? "REMIDI" : "TIDAK REMIDI";
        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
        if (total > 81){
            System.out.println("Nilai Anda A, Setara dengan 4, dengan Kualifikasi SANGAT BAIK ");
        }
        else if (total > 73){
            System.out.println("Nilai Anda B+, Setara dengan 3.5, dengan Kualifikasi LEBIH DARI BAIK ");
        }
        else if (total > 65){
            System.out.println("Nilai Anda B, Setara dengan 3, dengan Kualifikasi BAIK ");
        }
        else if (total > 60){
            System.out.println("Nilai Anda C+, Setara dengan 2.5, dengan Kualifikasi LEBIH DARI CUKUP ");
        }
        else if (total > 50){
            System.out.println("Nilai Anda C, Setara dengan 2, dengan Kualifikasi CUKUP ");
        }
        else if (total > 39){
            System.out.println("Nilai Anda D, Setara dengan 1, dengan Kualifikasi KURANG ");
        }
        else {
            System.out.println("Nilai Anda E, Setara dengan 0, dengan Kualifikasi GAGAL ");
        }
     
            
        
    }
}
