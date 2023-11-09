import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner (System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = input01.nextInt();

            for(int i=1; i<=N; i++){
             System.out.print("*");
            }
    } 
}
