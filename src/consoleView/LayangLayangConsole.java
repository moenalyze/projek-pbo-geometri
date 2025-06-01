package consoleView;

import java.util.Scanner;
import bendageometri.LayangLayang;

public class LayangLayangConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double diagonal1 = 0;
        double diagonal2 = 0;
        double sisi1 = 0;
        double sisi2 = 0;

        System.out.println("*** Layang-Layang ***");

        // Input diagonal1
        while (true) {
            try {
                System.out.print("Masukkan panjang diagonal 1 (cm): ");
                diagonal1 = Double.parseDouble(input.nextLine());
                if (diagonal1 <= 0) {
                    System.out.println("⚠  Panjang diagonal harus lebih dari 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input diagonal harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input diagonal2
        while (true) {
            try {
                System.out.print("Masukkan panjang diagonal 2 (cm): ");
                diagonal2 = Double.parseDouble(input.nextLine());
                if (diagonal2 <= 0) {
                    System.out.println("⚠  Panjang diagonal harus lebih dari 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input diagonal harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input sisi1
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi 1 (cm): ");
                sisi1 = Double.parseDouble(input.nextLine());
                if (sisi1 <= 0) {
                    System.out.println("⚠  Panjang sisi harus lebih dari 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input sisi harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input sisi2
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi 2 (cm): ");
                sisi2 = Double.parseDouble(input.nextLine());
                if (sisi2 <= 0) {
                    System.out.println("⚠  Panjang sisi harus lebih dari 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input sisi harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Buat objek LayangLayang dan hitung
        LayangLayang layang = new LayangLayang(diagonal1, diagonal2, sisi1, sisi2);
        double luas = layang.hitungLuas();
        double keliling = layang.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");
        System.out.printf("Luas Layang-Layang : %.2f cm²%n", luas);
        System.out.printf("Keliling Layang-Layang: %.2f cm%n", keliling);
        
        System.out.println("    ");
    }

    public static void main(String[] args) {
        show();
    }
}
