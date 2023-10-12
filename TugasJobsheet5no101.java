import java.util.Scanner;

public class TugasJobsheet5no101 {

    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.println("Tutorial Battle Start");
        System.out.print("Masukkan Jarak musuh:");
        int jarak = input01.nextInt();

        if (jarak<5){
            System.out.println("Use melee weapon");
        }
        else{
            System.out.println("Use Range Weapon");
        }
    }
    
}
