import java.util.Scanner;

public class PemilihanPercobaan301 {
    
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        double angka1, angka2 , hasil;
        char operator;
        System.out.print("Masukkan angka pertama: ");
        angka1 = input01.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input01.nextDouble();
        System.out.println("Masukkan Operator (+ - * /): ");
        operator = input01.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
                break;

        }
    }
}
