import java.util.Scanner;

public class UcapanTerimaKasih_01 {
    
    public static String PenerimaUcapan() {
        Scanner input01 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri Ucapan :");
        String namaOrang = input01.nextLine();
        return namaOrang;
    }
    public static void UcapanTambahan(String tambahan) {
        System.out.println("Pesan tambahan: "+tambahan);
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan("You've made a lasting impact on my life. Thank you!");
    }
}