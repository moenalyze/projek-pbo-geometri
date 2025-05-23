package consoleView;

import java.util.Scanner;

public class BangunRuangConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        
        while(loop) {
            System.out.println("*** BANGUN RUANG (3D) ***");
            System.out.println("Menu:");
            System.out.println("[1] Bola");
            System.out.println("[2] Kerucut");
            System.out.println("[3] Kerucut Terpancung");
            System.out.println("[4] Limas Belah Ketupat");
            System.out.println("[5] Limas Jajar Genjang");
            System.out.println("[6] Limas Layang-Layang");
            System.out.println("[7] Limas Persegi");
            System.out.println("[8] Limas Persegi Panjang");
            System.out.println("[9] Limas Segitiga");
            System.out.println("[10] Limas Trapesium");
            System.out.println("[11] Prisma Belah Ketupat");
            System.out.println("[12] Prisma Jajar Genjang");
            System.out.println("[13] Prisma Layang-Layang");
            System.out.println("[14] Prisma Persegi");
            System.out.println("[15] Prisma Persegi Panjang");
            System.out.println("[16] Prisma Segitiga");
            System.out.println("[17] Prisma Trapesium");
            System.out.println("[18] Tabung");
            System.out.println("[19] Cincin Bola");
            System.out.println("[20] Juring Bola");
            System.out.println("[21] Tembereng");
            System.out.println("[22] Kembali");
            System.out.print("Pilih: ");
            int pilihMenu = input.nextInt();

            switch(pilihMenu) {
                case 1:
                    BolaConsole.show();
                    loop = false;
                    break;
                case 2:
                    KerucutConsole.show();
                    loop = false;
                    break;
                case 3:
                    KerucutTerpancungConsole.show();
                    loop = false;
                    break;
                case 4:
                    LimasBelahKetupatConsole.show();
                    loop = false;
                    break;
                case 5:
//                    LimasJajarGenjangConsole.show();
                    loop = false;
                    break;
                case 6:
//                    LimasLayangLayangConsole.show();
                    loop = false;
                    break;
                case 7:
                    LimasPersegiConsole.show();
                    loop = false;
                    break;
                case 8:
                    LimasPersegiPanjangConsole.show();
                    loop = false;
                    break;
                case 9:
                    SegitigaConsole.show();
                    loop = false;
                    break;
                case 10:
                    TrapesiumConsole.show();
                    loop = false;
                    break;
                case 11:
                    PrismaBelahKetupatConsole.show();
                    loop = false;
                    break;
                case 12:
                    PrismaJajarGenjangConsole.show();
                    loop = false;
                    break;
                case 13:
                    PrismaLayangLayangConsole.show();
                    loop = false;
                    break;
                case 14:
                    PrismaPersegiConsole.show();
                    loop = false;
                    break;
                case 15:
                    PrismaPersegiPanjangConsole.show();
                    loop = false;
                    break;
                case 16:
                    SegitigaConsole.show();
                    loop = false;
                    break;
                case 17:
                    TrapesiumConsole.show();
                    loop = false;
                    break;
                case 18:
                    TabungConsole.show();
                    loop = false;
                    break;
                case 19:
//                    CincinBolaConsole.show();
                    loop = false;
                    break;
                case 20:
//                    JuringBolaConsole.show();
                    loop = false;
                    break;
                case 21:
//                    TemberengBolaConsole.show();
                    loop = false;
                    break;
                case 22:
                    MenuUtamaConsole.show();
                    loop = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
//                    input.nextLine();
            }
        }
    }
}
