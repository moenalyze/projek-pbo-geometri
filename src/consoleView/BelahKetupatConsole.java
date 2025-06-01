package consoleView;

import java.util.Scanner;
import bendageometri.BelahKetupat;

public class BelahKetupatConsole {
    public static void show() {
        Scanner inputBelahKetupat = new Scanner(System.in); // ******
        double diagonal1 = 0;
        double diagonal2 = 0;

        System.out.println("*** Belah Ketupat ***");
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

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas    : " + luas);
        System.out.println("Keliling: " + keliling);
    }
}
