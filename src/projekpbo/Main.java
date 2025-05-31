package projekpbo;

import consoleView.*;
import java.util.Scanner;
import projekpbo.bangunDatar.JajarGenjang;
import projekpbo.bangunRuang.Bola;
//import gui.BangunDatar;

public class Main {
    public static void main(String[] args) {
//        JuringLingkaranConsole.show();
//        KerucutTerpancungConsole.show();
//        BelahKetupatConsole.show();
//        LimasBelahKetupatConsole.show();
//        PrismaBelahKetupatConsole.show();
//        MenuUtamaConsole.show();
//        BolaConsole.show();
//        JajarGenjangConsole.show();
//        PrismaJajarGenjangConsole.show();
//        TabungConsole.show();
//        TemberengLingkaranConsole.show();
        
//        new BangunDatar();

        Scanner inputUser = new Scanner(System.in);
        boolean loop = true;
//        
        while(loop) {
            System.out.println("*** BANGUN DATAR (2D) ***");
            System.out.println("Menu:");
            System.out.println("[1] Belah Ketupat");
            System.out.println("[2] Jajar Genjang");
            System.out.println("[3] Lingkaran");
            System.out.println("[4] Layang-Layang");
            System.out.println("[5] Persegi");
            System.out.println("[6] Persegi Panjang");
            System.out.println("[7] Segitiga");
            System.out.println("[8] Trapesium");
            System.out.println("[9] Juring Lingkaran");
            System.out.println("[10] Tembereng Lingkaran");
//            System.out.println("[11] Kembali");
            
            System.out.println("*** BANGUN RUANG (3D) ***");
            System.out.println("Menu:");
            System.out.println("[11] Bola");
            System.out.println("[12] Kerucut");
            System.out.println("[13] Kerucut Terpancung");
            System.out.println("[14] Limas Belah Ketupat");
            System.out.println("[15] Limas Jajar Genjang");
            System.out.println("[16] Limas Layang-Layang");
            System.out.println("[17] Limas Persegi");
            System.out.println("[18] Limas Persegi Panjang");
            System.out.println("[19] Limas Segitiga");
            System.out.println("[20] Limas Trapesium");
            System.out.println("[21] Prisma Belah Ketupat");
            System.out.println("[22] Prisma Jajar Genjang");
            System.out.println("[23] Prisma Layang-Layang");
            System.out.println("[24] Prisma Persegi");
            System.out.println("[25] Prisma Persegi Panjang");
            System.out.println("[26] Prisma Segitiga");
            System.out.println("[27] Prisma Trapesium");
            System.out.println("[28] Tabung");
            System.out.println("[29] Cincin Bola");
            System.out.println("[30] Juring Bola");
            System.out.println("[31] Tembereng");
            System.out.println("[32] Kembali");
            System.out.print("Pilih: ");
            System.out.print("Pilih: ");
            int pilihMenu = inputUser.nextInt();
            int multithread;
            int jumlahLooping;

            switch(pilihMenu) {
                case 1:
                    BelahKetupatConsole.show();
                    loop = false;
                    break;
                        
                case 2:
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                    multithread = inputUser.nextInt();
                    jumlahLooping = 0;
                    
                    if(multithread == 1) {
                        System.out.println("*** Jajar Genjang (Multi-threaded) ***");
                        while (true) {
                        try {
                            System.out.print("Berapa kali perhitungan ingin dilakukan (looping)? ");
                            jumlahLooping = inputUser.nextInt();
                            System.out.flush(); 
                            if (jumlahLooping <= 0) {
                                System.out.println("Jumlah looping harus lebih dari 0.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
                        } catch (Exception e) {
                            System.out.println("Terjadi kesalahan: " + e.getMessage());
                        }
                    }

                        // Menjalankan thread sebanyak jumlahLooping
                        for (int i = 1; i <= jumlahLooping; i++) {
                            Thread t = new Thread(new thread.JajarGenjangThread(i));  // kirim nomor urut i
                            t.start();
                        }

                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Jajar Genjang (Single-threaded) ***");
//
//                        int jumlahLooping = 0;
                        while (true) {
                            try {
                                System.out.print("Berapa kali perhitungan ingin dilakukan (looping)? ");
                                jumlahLooping = inputUser.nextInt();
                                if (jumlahLooping <= 0) {
                                    System.out.println("Jumlah looping harus lebih dari 0.");
                                    continue;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
                            } catch (Exception e) {
                                System.out.println("Terjadi kesalahan: " + e.getMessage());
                            }
                        }
                        
                        BendaGeometri[] jajarGenjang = new BendaGeometri[jumlahLooping];
                        // Menjalankan perhitungan jajar genjang sebanyak jumlahLooping kali (tanpa thread)
                        for (int i = 0; i < jumlahLooping; i++) {
                            double alas = 5 + Math.random() * 20;     // 5 - 25
                            double tinggi = 5 + Math.random() * 20;   // 5 - 25
                            double sudut = 30 + Math.random() * 60;   // 30 - 90 derajat

//                            JajarGenjang jg = new JajarGenjang(alas, tinggi, sudut);
                            jajarGenjang[i] = new JajarGenjang(alas, tinggi, sudut);
                            double luas = jajarGenjang[i].hitungLuas();
                            double keliling = jajarGenjang[i].hitungKeliling();

                            System.out.printf("Loop-%d | Alas: %.2f | Tinggi: %.2f | Sudut: %.2f | Luas: %.2f | Keliling: %.2f%n",
                                    (i + 1), alas, tinggi, sudut, luas, keliling);
                        }
                    }
                    loop = false;
                    break;
                case 3:
                    LingkaranConsole.show();
                    loop = false;
                    break;
                case 4:
                    LayangLayangConsole.show();
                    loop = false;
                    break;
                case 5:
                    PersegiConsole.show();
                    loop = false;
                    break;
                case 6:
                    PersegiPanjangConsole.show();
                    loop = false;
                    break;
                case 7:
                    SegitigaConsole.show();
                    loop = false;
                    break;
                case 8:
                    TrapesiumConsole.show();
                    loop = false;
                    break;
                case 9:
                    JuringLingkaranConsole.show();
                    loop = false;
                    break;
                case 10:
                    System.out.println("*** Tembereng ***");
                    while (true) {
                        try {
                            System.out.print("Berapa kali perhitungan ingin dilakukan (looping)? ");
                            jumlahLooping = inputUser.nextInt();
                            if (jumlahLooping <= 0) {
                                System.out.println("Jumlah looping harus lebih dari 0.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
                        } catch (Exception e) {
                            System.out.println("Terjadi kesalahan: " + e.getMessage());
                        }
                    }

                    // Menjalankan thread sebanyak jumlahLooping
                    for (int i = 1; i <= jumlahLooping; i++) {
                        Thread t = new Thread(new thread.TemberengLingkaranThread(i));  // kirim nomor urut i
                        t.start();
                    }   


                    loop = false;
                    break;
                case 11:
                    System.out.println("*** Bola (Multi-threaded) ***");
                    while (true) {
                        try {
                            System.out.print("Berapa kali perhitungan ingin dilakukan (looping)? ");
                            jumlahLooping = inputUser.nextInt();
                            System.out.flush(); 
                            if (jumlahLooping <= 0) {
                                System.out.println("Jumlah looping harus lebih dari 0.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
                        } catch (Exception e) {
                            System.out.println("Terjadi kesalahan: " + e.getMessage());
                        }
                    }

                    // Menjalankan thread sebanyak jumlahLooping
                    for (int i = 1; i <= jumlahLooping; i++) {
                        Thread t = new Thread(new thread.BolaThread(i));  // kirim nomor urut i
                        t.start();
                    }
                    loop = false;
                    break;
                case 22:
                    System.out.println("*** Prisma Jajar Genjang ***");
                    while (true) {
                        try {
                            System.out.print("Berapa kali perhitungan ingin dilakukan (looping)? ");
                            jumlahLooping = inputUser.nextInt();
                            if (jumlahLooping <= 0) {
                                System.out.println("Jumlah looping harus lebih dari 0.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
                        } catch (Exception e) {
                            System.out.println("Terjadi kesalahan: " + e.getMessage());
                        }
                    }

                    // Menjalankan thread sebanyak jumlahLooping
                    for (int i = 1; i <= jumlahLooping; i++) {
                        Thread t = new Thread(new thread.PrismaJajarGenjangThread(i));  // kirim nomor urut i
                        t.start();
                    }   
                    loop = false;
                    break;
                case 32:
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
