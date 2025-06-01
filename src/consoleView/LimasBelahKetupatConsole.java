package consoleView;

import java.util.Scanner;
import bendageometri.BelahKetupat;
import bendageometri.LimasBelahKetupat;

public class LimasBelahKetupatConsole {
    public static void show() {
        Scanner inputLimasBelahKetupat = new Scanner(System.in); //**** ga boleh cuma "input"
        double diagonal1 = 0;
        double diagonal2 = 0;
        double tinggiLimas = 0;
        double tinggiSisiTegak = 0;

        System.out.println("*** Limas Belah Ketupat ***");
        while (true) {
            try {
                System.out.print("Masukkan diagonal 1 (cm) : ");
                diagonal1 = Double.parseDouble(inputLimasBelahKetupat.nextLine());
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
                diagonal2 = Double.parseDouble(inputLimasBelahKetupat.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input diagonal harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan tinggi limas (cm) : ");
                tinggiLimas = Double.parseDouble(inputLimasBelahKetupat.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input jari-jari harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Masukkan tinggi sisi tegak (cm) : ");
                tinggiSisiTegak = Double.parseDouble(inputLimasBelahKetupat.nextLine());
//                double s = Math.sqrt(Math.pow(diagonal1 / 2.0, 2) + Math.pow(diagonal2 / 2.0, 2)); // sisi belah ketupat
//                double tinggiMinimal = Math.sqrt(Math.pow(s / 2.0, 2) + Math.pow(tinggiLimas, 2));
//
//                if (tinggiSisiTegak < tinggiMinimal) {
//                    throw new IllegalArgumentException("Tinggi sisi tegak terlalu pendek (harus >= " + tinggiMinimal + ")");
//                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input jari-jari harus berupa angka. Silakan coba lagi.");
            } catch (IllegalArgumentException e) {
                System.out.println("!! Error: " + e.getMessage());
            }
        }

        // ikutin ini polymorphism
        BelahKetupat limasBelahKetupat = new LimasBelahKetupat(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak); //**** polymorphism
        //parent bangun3d = new bangun3d ()
        double volume = limasBelahKetupat.hitungVolume();
        double luasPermukaan = limasBelahKetupat.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Volume : " + volume);
        System.out.println("Luas Permukaan : " + luasPermukaan);
    }
}
