package bendageometri;

import consoleView.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
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
            int pilihMenu = inputUser.nextInt();
            int multithread;
            int jumlahLooping;

            switch(pilihMenu) {
                case 1:
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                    multithread = inputUser.nextInt();
                    jumlahLooping = 0;
                    
                    if(multithread == 1) {
                        System.out.println("*** Belah Ketupat (Multi-threaded) ***");
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
                            Thread t = new Thread(new bendageometri.BelahKetupatThread(i));  // kirim nomor urut i
                            t.start();
                        }

                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Belah Ketupat (Single-threaded) ***");
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
                        
                        BendaGeometri[] belahKetupat = new BendaGeometri[jumlahLooping];
                        // Menjalankan perhitungan belah ketupat sebanyak jumlahLooping kali (tanpa thread)
                        for (int i = 0; i < jumlahLooping; i++) {
                            double diagonal1 = 5 + Math.random() * 20; // 5 - 25
                            double diagonal2 = 5 + Math.random() * 20; // 5 - 25

                            belahKetupat[i] = new BelahKetupat(diagonal1, diagonal2);
                            double luas = belahKetupat[i].hitungLuas();
                            double keliling = belahKetupat[i].hitungKeliling();
                            
                            System.out.printf(
                                "Thread Belah Ketupat #%d | Diagonal1: %.2f cm | Diagonal2: %.2f cm | Luas: %.2f cm² | Keliling: %.2f cm%n",
                                (i + 1), diagonal1, diagonal2, luas, keliling
                            );
                        }
                    }
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
                            Thread t = new Thread(new bendageometri.JajarGenjangThread(i));  // kirim nomor urut i
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
                     System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                        multithread = inputUser.nextInt();
                        jumlahLooping = 0;

                        if (multithread == 1) {
                            System.out.println("*** Lingkaran (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.LingkaranThread(i));  // kirim nomor urut i
                                t.start();
                            }
                        } else if (multithread == 0) {
                            System.out.println("*** Lingkaran (Single-threaded) ***");
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

                            BendaGeometri[] lingkaran = new BendaGeometri[jumlahLooping];
                            // Menjalankan perhitungan lingkaran sebanyak jumlahLooping kali (tanpa thread)
                            for (int i = 0; i < jumlahLooping; i++) {
                                double jariJari = 5 + Math.random() * 20;   // 5 - 25

                                lingkaran[i] = new Lingkaran(jariJari);
                                double luas = lingkaran[i].hitungLuas();
                                double keliling = lingkaran[i].hitungKeliling();

                                System.out.printf("Loop-%d | Jari-jari: %.2f | Luas: %.2f | Keliling: %.2f%n",
                                        (i + 1), jariJari, luas, keliling);
                            }
                        }
                        loop = false;
                        break;
                case 4:
                    System.out.println("*** Layang-Layang (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.LayangLayangThread(i));  // kirim nomor urut i
                                t.start();
                            }
                case 5:
                    System.out.println("*** Persegi (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.LimasPersegiThread(i));  // kirim nomor urut i
                                t.start();
                            }
                case 6:
                     System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                        multithread = inputUser.nextInt();
                        jumlahLooping = 0;

                        if (multithread == 1) {
                            System.out.println("*** Persegi Panjang (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.PersegiPanjangThread(i)); // kirim nomor urut i
                                t.start();
                            }
                        } else if (multithread == 0) {
                            System.out.println("*** Persegi Panjang (Single-threaded) ***");
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

                            BendaGeometri[] persegiPanjang = new BendaGeometri[jumlahLooping];
                            // Menjalankan perhitungan persegi panjang sebanyak jumlahLooping kali (tanpa thread)
                            for (int i = 0; i < jumlahLooping; i++) {
                                double panjang = 5 + Math.random() * 20;   // 5 - 25
                                double lebar = 5 + Math.random() * 20;     // 5 - 25

                                persegiPanjang[i] = new PersegiPanjang(panjang, lebar);
                                double luas = persegiPanjang[i].hitungLuas();
                                double keliling = persegiPanjang[i].hitungKeliling();

                                System.out.printf("Loop-%d | Panjang: %.2f | Lebar: %.2f | Luas: %.2f | Keliling: %.2f%n",
                                        (i + 1), panjang, lebar, luas, keliling);
                            }
                        }
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
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                    multithread = inputUser.nextInt();
                    jumlahLooping = 0;
                    
                    if(multithread == 1) {
                        System.out.println("*** Juring Lingkaran (Multi-threaded) ***");
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
                            Thread t = new Thread(new bendageometri.JuringLingkaranThread(i));  // kirim nomor urut i
                            t.start();
                        }

                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Juring Lingkaran (Single-threaded) ***");
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
                        
                        BendaGeometri[] juringLingkaran = new BendaGeometri[jumlahLooping];
                        // Menjalankan perhitungan belah ketupat sebanyak jumlahLooping kali (tanpa thread)
                        for (int i = 0; i < jumlahLooping; i++) {
                            double jariJari = 5 + Math.random() * 15; // 5 - 20 cm
                            double sudut = Math.random() * 360;       // 0 - 360 derajat

                            juringLingkaran[i] = new JuringLingkaran(jariJari, sudut);
                            double luas = juringLingkaran[i].hitungLuas();
                            double keliling = juringLingkaran[i].hitungKeliling();
                            
                            System.out.printf(
                               "Thread Juring Lingkaran #%d | Jari-jari: %.2f cm | Sudut: %.2f derajat | Luas: %.2f cm² | Keliling: %.2f cm%n",
                               (i + 1), jariJari, sudut, luas, keliling
                            );
                        }
                    }
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
                        Thread t = new Thread(new bendageometri.TemberengLingkaranThread(i));  // kirim nomor urut i
                        t.start();
                    }   


                    loop = false;
                    break;
                case 11:
//                    System.out.println("*** Bola (Multi-threaded) ***");
//                    while (true) {
//                        try {
//                            System.out.print("Berapa kali perhitungan ingin dilakukan (looping)? ");
//                            jumlahLooping = inputUser.nextInt();
//                            System.out.flush(); 
//                            if (jumlahLooping <= 0) {
//                                System.out.println("Jumlah looping harus lebih dari 0.");
//                                continue;
//                            }
//                            break;
//                        } catch (NumberFormatException e) {
//                            System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
//                        } catch (Exception e) {
//                            System.out.println("Terjadi kesalahan: " + e.getMessage());
//                        }
//                    }
//
//                    // Menjalankan thread sebanyak jumlahLooping
//                    for (int i = 1; i <= jumlahLooping; i++) {
//                        Thread t = new Thread(new thread.BolaThread(i));  // kirim nomor urut i
//                        t.start();
//                    }
                    
                    System.out.println("*** Bola (Multi-threaded dengan Thread Pool) ***");

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
                        } catch (Exception e) {
                            System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
                            inputUser.nextLine(); // clear buffer
                        }
                    }

                    // Buat thread pool dengan jumlah thread tetap (misal 4 thread)
//                    int jumlahThread = 100; // atau bisa disesuaikan
                    ExecutorService executor = Executors.newFixedThreadPool(100);
//                    ExecutorService executor = Executors.newCachedThreadPool();

                    // Submit task (BolaThread) ke executor
                    for (int i = 1; i <= jumlahLooping; i++) {
                        executor.execute(new bendageometri.BolaThread(i));
                        executor.execute(new bendageometri.JajarGenjangThread(i));
                        executor.execute(new bendageometri.TabungThread(i));
                    }

                    // Setelah submit semua, shutdown executor agar program bisa selesai
                    executor.shutdown();
                    
                   
                    loop = false;
                    break;
                case 12:
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                        multithread = inputUser.nextInt();
                        jumlahLooping = 0;

                        if (multithread == 1) {
                            System.out.println("*** Kerucut (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.KerucutThread(i));  // kirim nomor urut i
                                t.start();
                            }
                        } else if (multithread == 0) {
                            System.out.println("*** Kerucut (Single-threaded) ***");
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

                            BendaGeometri[] kerucut = new BendaGeometri[jumlahLooping];
                            // Menjalankan perhitungan kerucut sebanyak jumlahLooping kali (tanpa thread)
                            for (int i = 0; i < jumlahLooping; i++) {
                                double jariJari = 5 + Math.random() * 20;  // 5 - 25
                                double tinggi = 5 + Math.random() * 20;    // 5 - 25

                                kerucut[i] = new Kerucut(jariJari, tinggi);
                                double luasPermukaan = kerucut[i].hitungLuasPermukaan();
                                double volume = kerucut[i].hitungVolume();

                                System.out.printf("Loop-%d | Jari-jari: %.2f | Tinggi: %.2f | Luas Permukaan: %.2f | Volume: %.2f%n",
                                        (i + 1), jariJari, tinggi, luasPermukaan, volume);
                            }
                        }
                        loop = false;
                        break;
                case 13:
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                    multithread = inputUser.nextInt();
                    jumlahLooping = 0;
                    
                    if(multithread == 1) {
                        System.out.println("*** Kerucut Terpancung (Multi-threaded) ***");
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
                            Thread t = new Thread(new bendageometri.KerucutTerpancungThread(i));  // kirim nomor urut i
                            t.start();
                        }

                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Kerucut Terpancung (Single-threaded) ***");
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
                        
                        BendaGeometri[] kerucutTerpancung = new BendaGeometri[jumlahLooping];
                        // Menjalankan perhitungan jajar genjang sebanyak jumlahLooping kali (tanpa thread)
                        for (int i = 0; i < jumlahLooping; i++) {
                            double tinggi = 5 + Math.random() * 15;             // 5 - 20 cm
                            double jariJariAtas = 5 + Math.random() * 15;             // 5 - 20 cm
                            double jariJariBawah = 5 + Math.random() * 15;             // 5 - 20 cm

                            kerucutTerpancung[i] = new KerucutTerpancung(tinggi, jariJariAtas, jariJariBawah);
                            double volume = kerucutTerpancung[i].hitungVolume();
                            double luasPermukaan = kerucutTerpancung[i].hitungLuasPermukaan();

                            System.out.printf(
                                "Thread Kerucut Terpancung #%d | Tinggi: %.2f cm | Jari-jari atas: %.2f cm | Jari-jari bawah: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
                                (i + 1), tinggi, jariJariAtas, jariJariBawah, volume, luasPermukaan
                            );
                        }
                    }
                    loop = false;
                    break;
                case 14:
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                    multithread = inputUser.nextInt();
                    jumlahLooping = 0;
                    
                    if(multithread == 1) {
                        System.out.println("*** Limas Belah Ketupat (Multi-threaded) ***");
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
                            Thread t = new Thread(new bendageometri.LimasBelahKetupatThread(i));  // kirim nomor urut i
                            t.start();
                        }

                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Limas Belah Ketupat (Single-threaded) ***");
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
                        
                        BendaGeometri[] limasBelahKetupat = new BendaGeometri[jumlahLooping];
                        // Menjalankan perhitungan jajar genjang sebanyak jumlahLooping kali (tanpa thread)
                        for (int i = 0; i < jumlahLooping; i++) {
                            double diagonal1 = 5 + Math.random() * 20; // 5 - 25
                            double diagonal2 = 5 + Math.random() * 20; // 5 - 25
                            double tinggiLimas = 5 + Math.random() * 20; // 5 - 25
                            double tinggiSisiTegak = 5 + Math.random() * 20; // 5 - 25

                            limasBelahKetupat[i] = new LimasBelahKetupat(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak);
                            double volume = limasBelahKetupat[i].hitungVolume();
                            double luasPermukaan = limasBelahKetupat[i].hitungLuasPermukaan();

                            System.out.printf(
                                "Thread Limas Belah Ketupat #%d | Diagonal 1: %.2f cm | Diagonal 2: %.2f cm | Tinggi Limas: %.2f cm | Tinggi Sisi Tegak: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
                                (i + 1), diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak, volume, luasPermukaan
                            );
                        }
                    }
                    loop = false;
                    break;
                case 17:
                    System.out.println("*** Limas Persegi  (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.LimasPersegiThread(i));  // kirim nomor urut i
                                t.start();
                            }
                            
                case 18:
                    System.out.println("*** Limas Persegi Panjang (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.LimasPersegiPanjangThread(i));  // kirim nomor urut i
                                t.start();
                            }
                            
                case 21:
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                    multithread = inputUser.nextInt();
                    jumlahLooping = 0;
                    
                    if(multithread == 1) {
                        System.out.println("*** Prisma Belah Ketupat (Multi-threaded) ***");
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
                            Thread t = new Thread(new bendageometri.PrismaBelahKetupatThread(i));  // kirim nomor urut i
                            t.start();
                        }

                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Prisma Belah Ketupat (Single-threaded) ***");
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
                        
                        BendaGeometri[] prismaBelahKetupat = new BendaGeometri[jumlahLooping];
                        // Menjalankan perhitungan jajar genjang sebanyak jumlahLooping kali (tanpa thread)
                        for (int i = 0; i < jumlahLooping; i++) {
                            double diagonal1 = 5 + Math.random() * 20; // 5 - 25
                            double diagonal2 = 5 + Math.random() * 20; // 5 - 25
                            double tinggiPrisma = 5 + Math.random() * 20; // 5 - 25

                            prismaBelahKetupat[i] = new PrismaBelahKetupat(diagonal1, diagonal2, tinggiPrisma);
                            double volume = prismaBelahKetupat[i].hitungVolume();
                            double luasPermukaan = prismaBelahKetupat[i].hitungLuasPermukaan();

                             System.out.printf(
                                "Thread Prisma Belah Ketupat #%d | Diagonal 1: %.2f cm | Diagonal 2: %.2f cm | Tinggi Prisma: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
                                (i + 1), diagonal1, diagonal2, tinggiPrisma, volume, luasPermukaan
                            );
                        }
                    }
                    loop = false;
                    break;
                case 25:
                    System.out.println("*** Prisma Persegi Panjang (Multi-threaded) ***");
//                            while (true) {
//                                try {
//                                    System.out.print("Berapa kali perhitungan ingin dilakukan (looping)? ");
//                                    jumlahLooping = inputUser.nextInt();
//                                    if (jumlahLooping <= 0) {
//                                        System.out.println("Jumlah looping harus lebih dari 0.");
//                                        continue;
//                                    }
//                                    break;
//                                } catch (NumberFormatException e) {
//                                    System.out.println("Input harus berupa angka bulat. Silakan coba lagi.");
//                                } catch (Exception e) {
//                                    System.out.println("Terjadi kesalahan: " + e.getMessage());
//                                }
//                            }
//
//                            // Menjalankan thread sebanyak jumlahLooping
//                            for (int i = 1; i <= jumlahLooping; i++) {
//                                Thread t = new Thread(new thread.PrismaPersegiPanjangThread(i));  // kirim nomor urut i
//                                t.start();
//                            }
                    
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
                        Thread t = new Thread(new bendageometri.PrismaJajarGenjangThread(i));  // kirim nomor urut i
                        t.start();
                    }   
                    loop = false;
                    break;
                case 23:
                    System.out.println("*** Prisma Layang-Layang (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.PrismaLayangLayangThread(i));  // kirim nomor urut i
                                t.start();
                            }
                case 24:
                    System.out.println("*** Prisma Persegi (Multi-threaded) ***");
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
                                Thread t = new Thread(new bendageometri.PrismaPersegiThread(i));  // kirim nomor urut i
                                t.start();
                            }
                case 32:
//                    MenuUtamaConsole.show();
//                    loop = false;
//                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
//                    input.nextLine();
            }
            
        }
        
    }
}
