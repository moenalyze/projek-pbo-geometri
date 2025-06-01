//package consoleView;
//
//import java.util.Scanner;
//import projekpbo.bangunRuang.KerucutTerpancung;
//
//public class KerucutTerpancungConsole {
//    public static void show() {
//        Scanner input = new Scanner(System.in);
//        double jariJari = 0;
//        double jariJariAtas = 0;
//        double tinggi = 0;
//
//        System.out.println("*** Kerucut Terpancung ***");
//        while (true) {
//            try {
//                System.out.print("Masukkan jari-jari bawah (cm) : ");
//                jariJari = Double.parseDouble(input.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("!! Input jari-jari harus berupa angka. Silakan coba lagi.");
//            } catch (Exception e) {
//                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
//            }
//        }
//        
//        while (true) {
//            try {
//                System.out.print("Masukkan jari-jari atas (cm) : ");
//                jariJariAtas = Double.parseDouble(input.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("!! Input jari-jari harus berupa angka. Silakan coba lagi.");
//            } catch (Exception e) {
//                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
//            }
//        }
//
//        // Input sudut dengan validasi
//        while (true) {
//            try {
//                System.out.print("Masukkan tinggi (cm): ");
//                tinggi = Double.parseDouble(input.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("!! Input tinggi harus berupa angka. Silakan coba lagi.");
//            } catch (Exception e) {
//                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
//            }
//        }
//
//        KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(tinggi, jariJariAtas, jariJari);
//        double volume = kerucutTerpancung.hitungVolume();
//        double luasPermukaan = kerucutTerpancung.hitungLuasPermukaan();
//
//        System.out.println();
//        System.out.println("---Hasil Perhitungan---");
//        System.out.println("Volume : " + volume);
//        System.out.println("Luas Permukaan : " + luasPermukaan);
//    }
//}
