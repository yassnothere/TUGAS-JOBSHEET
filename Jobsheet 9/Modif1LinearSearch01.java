import java.util.Scanner;

public class Modif1LinearSearch01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        
        int key = 20;
        int hasil = 0, x;

        System.out.print("Masukkan jumlah elemen array : ");
        x = input01.nextInt();
        int [] arrayInt = new int [x];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt [i] = input01.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        key = input01.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt [i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array ada di posisi indeks ke-" + hasil);
    }
}



