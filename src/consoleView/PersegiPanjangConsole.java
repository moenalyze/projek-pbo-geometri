package consoleView;
import java.util.Scanner;
import bendageometri.PersegiPanjang;

public class PersegiPanjangConsole {

    public static void show() {
        Scanner inputPersegiPanjang = new Scanner(System.in);
        double panjang = 0;
        double lebar = 0;

        System.out.println("* Persegi Panjang *");
        while (true) {
            try {
                System.out.print("Masukkan panjang : ");
                panjang = Double.parseDouble(inputPersegiPanjang.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input panjang harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input sudut dengan validasi
        while (true) {
            try {
                System.out.print("Masukkan lebar: ");
                lebar = Double.parseDouble(inputPersegiPanjang.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input lebar harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        PersegiPanjang PPanjang = new PersegiPanjang(panjang, lebar);
        double luas = PPanjang.hitungLuas();
        double keliling = PPanjang.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Persegi Panjang    : " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
    
}