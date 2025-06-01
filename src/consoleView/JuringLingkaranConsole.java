package consoleView;

import java.util.Scanner;
import bendageometri.JuringLingkaran;

public class JuringLingkaranConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double jariJari = 0;
        double sudut = 0;

        System.out.println("*** Juring Lingkaran ***");
        while (true) {
            try {
                System.out.print("Masukkan jari-jari (cm) : ");
                jariJari = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input jari-jari harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input sudut dengan validasi
        while (true) {
            try {
                System.out.print("Masukkan sudut (derajat): ");
                sudut = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input sudut harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        JuringLingkaran juring = new JuringLingkaran(jariJari, sudut);
        double luas = juring.hitungLuas();
        double keliling = juring.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Juring    : " + luas);
        System.out.println("Keliling Juring: " + keliling);
    }
}
