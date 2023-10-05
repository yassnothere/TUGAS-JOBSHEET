import java.util.Scanner;

public class TugasJobsheet5no201 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean login = false;
        while (login == false){
            System.out.println("Masukkan Username");
            String username = input.nextLine();
            System.out.println("Masukkan Password");
            String password = input.nextLine();
            if (username.equals("Admin") && password.equals("12345")){
                System.out.println("Log in berhasil");
                login = true;
            }
            else {
                System.out.println("user dan password salah");
            }
        }
    }
}
