import java.util.Scanner;

public class Modif2BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int Pilihan = input01.nextInt();
            input01.nextLine();

            switch (Pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = input01.nextLine();
                    System.out.print("Masukkan Baris (1-4): ");
                    baris = input01.nextInt();
                    System.out.print("Masukkan Kolom (1-2): ");
                    kolom = input01.nextInt();
                    input01.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris-1][kolom-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                        } else {
                                System.out.println("Kursi sudah ditempati. Silakan pilih kursi lain.");
                            }
                    } else {
                            System.out.println("Nomor baris atau kolom tidak valid. Harap masukkan nomor yang sesuai.");
                        }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! ");
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = input01.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}