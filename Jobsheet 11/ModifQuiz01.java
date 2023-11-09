import java.util.Scanner;
import java.util.Random; 

public class ModifQuiz01 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input01 = new Scanner(System.in);

        char menu ='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input01.nextInt();
                input01.nextLine();
                
                if (answer < number){
                    System.out.println("Angka yang anda masukkan lebih kecil dari jawaban.");
                }else if (answer > number){
                    System.out.println("Angka yang anda masukkan lebih besar dari jawaban");
                }else {
                    System.out.println("Jawaban Anda Benar! ");
                    success = true;
                }
            } 
            while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/N)?");
            menu = input01.nextLine().charAt(0);
        
        }while (menu == 'Y' || menu == 'y');

        System.out.println("Terima kasih telah bermain!");
       
    }
}


