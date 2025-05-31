//package consoleView;
//
//import java.util.Scanner;
//import projekpbo.bangunDatar.BelahKetupat;
//
//public class BelahKetupatConsole {
//    public static void show() {
//        Scanner inputBelahKetupat = new Scanner(System.in); // ******
//        double diagonal1 = 0;
//        double diagonal2 = 0;
//
//        System.out.println("*** Belah Ketupat ***");
//        while (true) {
//            try {
//                System.out.print("Masukkan diagonal 1 (cm) : ");
//                diagonal1 = Double.parseDouble(inputBelahKetupat.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("!! Input diagonal harus berupa angka. Silakan coba lagi.");
//            } catch (Exception e) {
//                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
//            }
//        }
//
//        while (true) {
//            try {
//                System.out.print("Masukkan diagonal 2 (cm) : ");
//                diagonal2 = Double.parseDouble(inputBelahKetupat.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("!! Input diagonal harus berupa angka. Silakan coba lagi.");
//            } catch (Exception e) {
//                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
//            }
//        }
//
//        BelahKetupat belahKetupat = new BelahKetupat(diagonal1, diagonal2);
//        double luas = belahKetupat.hitungLuas();
//        double keliling = belahKetupat.hitungKeliling();
//
//        System.out.println();
//        System.out.println("---Hasil Perhitungan---");
//
//        System.out.println("Luas    : " + luas);
//        System.out.println("Keliling: " + keliling);
//    }
//}

package consoleView;

import java.util.Scanner;
import projekpbo.bangunDatar.BelahKetupat;

public class BelahKetupatConsole {
    public static void show() {
        Scanner inputBelahKetupat = new Scanner(System.in);
        double diagonal1 = 0;
        double diagonal2 = 0;

        System.out.println("*** Belah Ketupat ***");

        // Contoh Math.random(): Kasih hint ukuran acak
        double randomHint = 10 + Math.random() * 20; // Ukuran antara 10-30 cm
        System.out.printf("Masukkan ukuran (sekitar %.2f cm yaa): %n", randomHint);

        while (true) {
            try {
                System.out.print("Masukkan diagonal 1 (cm) : ");
                diagonal1 = Double.parseDouble(inputBelahKetupat.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input diagonal harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Masukkan diagonal 2 (cm) : ");
                diagonal2 = Double.parseDouble(inputBelahKetupat.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input diagonal harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        BelahKetupat belahKetupat = new BelahKetupat(diagonal1, diagonal2);
        double luas = belahKetupat.hitungLuas();
        double keliling = belahKetupat.hitungKeliling();

        // Contoh Math.random(): Kasih komentar acak
        String[] komentar = {"Wih, keren!", "Mantap!", "Nice!", "Luar biasa!"};
        int randomIndex = (int) (Math.random() * komentar.length);
        System.out.println(komentar[randomIndex]);

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas    : " + luas);
        System.out.println("Keliling: " + keliling);
    }
}