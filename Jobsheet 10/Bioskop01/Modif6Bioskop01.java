import java.util.Scanner; 
public class Modif6Bioskop01 {
    public static void main(String[] args) {
        String [][] penonton = new String[4][2];
    
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";
       
       for (int i = 0; i < penonton[2].length; i++) {
            System.out.println("Penonton pada baris ke- " + (i+1) + ": " + String.join(", ", penonton[i]));
        }
    }
}

