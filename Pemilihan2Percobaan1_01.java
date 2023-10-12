import java.util.Scanner;

public class Pemilihan2Percobaan1_01{
    public static void main(String[] args) {
        Scanner Input01 = new Scanner(System.in);
        System.out.print("Masukkan Tahun: ");
        int Tahun = Input01.nextInt();
        if ((Tahun % 4) == 0){
            if ((Tahun % 100) !=0)
            System.out.println("Tahun Kabisat");
        }
        else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
