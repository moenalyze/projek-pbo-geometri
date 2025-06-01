//package consoleView;
//
//import java.util.Scanner;
//
//public class MenuUtamaConsole {
//    public static void show() {
//        Scanner input = new Scanner(System.in);
//        
//        while(true) {
//            System.out.println("*** APLIKASI HITUNG BANGUN GEOMETRI ***");
//            System.out.println("Menu:");
//            System.out.println("[1] Bangun Datar (2D)");
//            System.out.println("[2] Bangun Ruang (3D)");
//            System.out.println("[3] Keluar");
//            System.out.print("Pilih: ");
//            int pilihMenu = input.nextInt();
//
//            switch(pilihMenu) {
//                case 1:
//                    BangunDatarConsole.show();
//                    break;
//                case 2:
//                    BangunRuangConsole.show();
//                    break;
//                case 3:
//                    System.exit(0);
//                default:
//                    System.out.println("Menu tidak tersedia!");
//            }
//        }
//    }
//}
