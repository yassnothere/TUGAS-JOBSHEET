import java.util.Scanner;

public class Pemilihan2Percobaan201{
    public static void main(String[] args){
        Scanner input01 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.println("Masukkan Sudut 1 ");
        sudut1 = input01.nextFloat();
        System.out.println("Masukkan Sudut 2 ");
        sudut2 = input01.nextFloat();
        System.out.println("Masukkan Sudut 3");
        sudut3 = input01.nextFloat();
        totalSudut = sudut1 + sudut2 + sudut3;
        
        if(totalSudut == 180) {
        if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah Segitiga Siku - Siku ");
        else if ((sudut1 == 70) || (sudut2 == 70) || (sudut3 == 40))
            System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki ");
        else if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
            System.out.println("Segitiga tersebut adalah Segitiga Sama Sisi ");
        else 
        System.out.println("Segitiga tersebut adalah segitga sembarang ");
        }
        else
        System.out.println("Bukan Segitiga ");
    }
}