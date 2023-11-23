import java.util.Arrays;
import java.util.Scanner;
public class Tugas4_01 {

    public static void main(String [] args) {
        Scanner scan04 = new Scanner(System.in);

            String[][] dataAtletPercabang = {
            {"Badminton", "Nova", "Lelyta", "Dhiya", "Annisa", "Salsa"},
            {"Tenis Meja", "Vanesa", "Yefta", "Hikmah", "Fajar", "Erik"},
            {"Basket", "Diyaz", "Heru", "Billy", "Tora", "Gilang"},
            {"Bola Voly", "Gege", "Haqi", "Aziz", "Rocky", "Wahib"}
        };

        
        for (int i = 0; i < dataAtletPercabang.length; i++) {
            for (int j = 1; j < dataAtletPercabang[i].length - 1; j++) {
                for (int k = j + 1; k < dataAtletPercabang[i].length; k++) {
                    if (dataAtletPercabang[i][j].compareTo(dataAtletPercabang[i][k]) > 0) {
                        String temp = dataAtletPercabang[i][j];
                        dataAtletPercabang[i][j] = dataAtletPercabang[i][k];
                        dataAtletPercabang[i][k] = temp;
                    }
                }
            }

            
            System.out.println("Data Cabang " + dataAtletPercabang[i][0] + " (ascending):");
            for (int j = 1; j < dataAtletPercabang[i].length; j++) {
                System.out.println(dataAtletPercabang[i][j]);
            }
            System.out.println();
        }
    }
}