import GUI.GUIPage;
import bendageometri.*;
import consoleView.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
// GUI
        GUIPage guiPage = new GUIPage();
        guiPage.setVisible(true);
        guiPage.setLocationRelativeTo(null);
        
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
            System.out.println("[31] Tembereng Bola");
            System.out.println("[32] Banyak Geometri");
            System.out.println("[33] Kembali");
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
                            // Menjalankan perhitungan lingkaran sebanyak jumlahLooping kali (tanpa thread)
                            for (int i = 0; i < jumlahLooping; i++) {
                                double jariJari = 5 + Math.random() * 20;   // 5 - 25
                                Lingkaran lingkaran = new Lingkaran(jariJari);

                                lingkaran = new Lingkaran(jariJari);
                                double luas = lingkaran.hitungLuas(jariJari);
                                double keliling = lingkaran.hitungKeliling(jariJari);

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
                               "Thread Juring Lingkaran #%d | Jari-jari: %.2f cm | Sudut: %.2f derajat | Luas: %.2f cm² | Keliling: %.2f cm%n%n",
                               (i + 1), jariJari, sudut, luas, keliling
                            );
                        }
                    }
                    loop = false;
                    break;
                case 10:
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
                        Thread t = new Thread(new TemberengLingkaranThread(i));  // kirim nomor urut i
                        t.start();
                    }
                        
                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Tembereng Lingkaran***");
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
                    
                    // Menjalankan perhitungan lingkaran sebanyak jumlahLooping kali (tanpa thread)
                           for (int i = 0; i < jumlahLooping; i++) {
                                try {
                                    double jariJari = 5 + Math.random() * 20;   // 5 - 25 cm
                                    double taliBusur = 1 + Math.random() * (2 * jariJari); // maksimal = diameter
                                    double sudut = 10 + Math.random() * 170;    // 10 - 180 derajat
                                    double busur = (2 * Math.PI * jariJari) * (sudut / 360.0);  // panjang busur

                                    Lingkaran temberengLingkaran = new TemberengLingkaran(jariJari, taliBusur, sudut, busur);

                                    double luas = temberengLingkaran.hitungLuas(jariJari);
                                    double keliling = temberengLingkaran.hitungKeliling(jariJari);

                                    if (temberengLingkaran instanceof TemberengLingkaran) {
                                        double luasTembereng = temberengLingkaran.hitungLuas();
                                        double kelilingTembereng = temberengLingkaran.hitungKeliling();

                                        System.out.printf("Luas Tembereng (overload): %.2f cm²%n", luasTembereng);
                                        System.out.printf("Keliling Tembereng (overload): %.2f cm%n", kelilingTembereng);
                                    }

                                    System.out.printf("Loop-%d | Jari-jari: %.2f | Luas lingkaran : %.2f | Keliling lingkaran: %.2f%n%n",
                                            (i + 1), jariJari, luas, keliling);

                                } catch (IllegalArgumentException e) {
                                    System.err.printf("Loop-%d ERROR: %s%n%n", i + 1, e.getMessage());
                                } catch (Exception e) {
                                    System.err.printf("Loop-%d ERROR TAK TERDUGA: %s%n%n", i + 1, e.getMessage());
                                }
                            }


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
                    
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                        multithread = inputUser.nextInt();
                        jumlahLooping = 0;

                        if (multithread == 0) {
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

                            // Menjalankan perhitungan lingkaran sebanyak jumlahLooping kali (tanpa thread)
                            for (int i = 0; i < jumlahLooping; i++) {
                                double jariJari = 5 + Math.random() * 20;   // 5 - 25
                                Lingkaran bola = new Bola(jariJari);

                                bola = new Bola(jariJari);
                                double luas = bola.hitungLuas(jariJari);
                                double keliling = bola.hitungKeliling(jariJari);
                                
                                 if (bola instanceof Bola) {
                                    double luasPermukaanOverload = ((Bola) bola).hitungLuasPermukaan(jariJari);
                                    double volumeOverload = ((Bola) bola).hitungVolume(jariJari);

                                    System.out.printf("Luas Permukaan Bola (overload): %.2f cm²%n", luasPermukaanOverload);
                                    System.out.printf("Volume Bola (overload): %.2f cm³%n", volumeOverload);
                                }

                                System.out.printf("Loop-%d | Jari-jari: %.2f | Luas lingkaran : %.2f | Keliling lingkaran: %.2f%n%n",
                                        (i + 1), jariJari, luas, keliling);
                            }
                        } else if (multithread == 1) {
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

                            // Submit task (BolaThread) ke executor
                    
                            for (int i = 1; i <= jumlahLooping; i++) {
                                Thread t = new Thread(new BolaThread(i));  // kirim nomor urut i
                                t.start();
                            }
                        }
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
                case 15:
    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread (0)? (1/0)");
    multithread = inputUser.nextInt();
    jumlahLooping = 0;

    if (multithread == 0) {
        System.out.println("*** Limas Jajar Genjang (Single-threaded) ***");
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
                inputUser.nextLine(); // untuk menghindari infinite loop
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 0; i < jumlahLooping; i++) {
            double alas = 5 + Math.random() * 15;          // 5–20 cm
            double tinggiAlas = 3 + Math.random() * 10;    // 3–13 cm
            double sisiMiring = 5 + Math.random() * 10;    // 5–15 cm
            double tinggiLimas = 5 + Math.random() * 15;   // 5–20 cm

            JajarGenjang limas = new LimasJajarGenjang(alas, tinggiAlas, sisiMiring, tinggiLimas);

            double luas = limas.hitungLuas();
            double keliling = limas.hitungKeliling();

            double luasAlas = alas * tinggiAlas;
            
                                    if(limas instanceof LimasJajarGenjang) {
                                        double luasPermukaanOverload = ((LimasJajarGenjang) limas).hitungLuasPermukaan(
                                        alas, tinggiAlas,
                                        sisiMiring, tinggiAlas
                                    );
                                    double volumeOverload = ((LimasJajarGenjang) limas).hitungVolume(luasAlas, tinggiAlas, tinggiLimas);

                                    System.out.printf("Luas Permukaan Limas Jajar Genjang (overload): %.2f cm²%n", luasPermukaanOverload);
                                    System.out.printf("Volume Limas Jajar Genjang (overload): %.2f cm³%n", volumeOverload);
                // double volumeOverload = limas.hitungVolume(luasAlas, tinggiAlas, tinggiLimas);
                // double luasPermOverload = limas.hitungLuasPermukaan(
                // alas, tinggiAlas,
                // sisiMiring, tinggiAlas
            // );
            }

            System.out.printf("Loop-%d%n", i + 1);
            System.out.printf("Alas=%.2f, TinggiAlas=%.2f, SisiMiring=%.2f, TinggiLimas=%.2f%n",
                              alas, tinggiAlas, sisiMiring, tinggiLimas);
            System.out.printf("Luas Jajar Genjang: %.2f cm³%n", luas);
            // System.out.printf("Volume overload: %.2f cm³%n", volumeOverload);
            System.out.printf("Keliling Jajar Genjang: %.2f cm²%n", keliling);
            // System.out.printf("Luas permukaan overload: %.2f cm²%n%n", luasPermOverload);
        }

    } else if (multithread == 1) {
        System.out.println("*** Limas Jajar Genjang (Multi-threaded) ***");
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
                inputUser.nextLine(); // untuk menghindari infinite loop
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 1; i <= jumlahLooping; i++) {
            Thread t = new Thread(new LimasJajarGenjangThread(i));
            t.start();
        }
    }
    loop = false;
    break;

    case 16:
    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread (0)? (1/0)");
    multithread = inputUser.nextInt();
    jumlahLooping = 0;

    if (multithread == 0) {
        System.out.println("*** Limas Layang-Layang (Single-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 0; i < jumlahLooping; i++) {
            // Generate nilai random
            double diagonal1 = 5 + Math.random() * 10;
            double diagonal2 = 5 + Math.random() * 10;
            double sisi1 = 3 + Math.random() * 5;
            double sisi2 = 4 + Math.random() * 6;
            double tinggiLimas = 6 + Math.random() * 5;
            double tinggiSisiTegak1 = 5 + Math.random() * 5;
            double tinggiSisiTegak2 = 5 + Math.random() * 5;

            // === POLYMORPHISM ===
            LayangLayang limas = new LimasLayangLayang(
                diagonal1, diagonal2, sisi1, sisi2,
                tinggiLimas, tinggiSisiTegak1, tinggiSisiTegak2
            );

            double luasLayang = limas.hitungLuas();
            double kelilingLayang = limas.hitungKeliling();

            System.out.printf("Loop-%d%n", i + 1);
            System.out.printf("Diagonal1: %.2f cm, Diagonal2: %.2f cm%n", diagonal1, diagonal2);
            System.out.printf("Sisi1: %.2f cm, Sisi2: %.2f cm%n", sisi1, sisi2);
            System.out.printf("Tinggi Limas: %.2f cm%n", tinggiLimas);
            System.out.printf("Tinggi Sisi Tegak1: %.2f cm, Tegak2: %.2f cm%n", tinggiSisiTegak1, tinggiSisiTegak2);
            System.out.printf("Luas Layang-Layang: %.2f cm²%n", luasLayang);
            System.out.printf("Keliling Layang-Layang: %.2f cm%n", kelilingLayang);

            if (limas instanceof LimasLayangLayang) {
                double volumeOverload = ((LimasLayangLayang) limas).hitungVolume(
                    diagonal1, diagonal2, sisi1, sisi2, tinggiLimas
                );
                double luasPermukaanOverload = ((LimasLayangLayang) limas).hitungLuasPermukaan(
                    diagonal1, diagonal2, sisi1, sisi2, tinggiSisiTegak1, tinggiSisiTegak2
                );

                System.out.printf("Volume Limas Layang-Layang (overload): %.2f cm³%n", volumeOverload);
                System.out.printf("Luas Permukaan Limas Layang-Layang (overload): %.2f cm²%n", luasPermukaanOverload);
            }

            System.out.println("----------------------------------------------------------");
        }

    } else if (multithread == 1) {
        System.out.println("*** Limas Layang-Layang (Multi-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 1; i <= jumlahLooping; i++) {
            Thread t = new Thread(new LimasLayangLayangThread(i));
            t.start();
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
                case 20:
    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread (0)? (1/0)");
    multithread = inputUser.nextInt();
    jumlahLooping = 0;

    if (multithread == 0) {
        System.out.println("*** Limas Trapesium (Single-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 0; i < jumlahLooping; i++) {
            // Generate nilai random
            double sisi1 = 6 + Math.random() * 4;              // 6–10 cm
            double sisi2 = 4 + Math.random() * 4;              // 4–8 cm
            double tinggiTrapesium = 4 + Math.random() * 3;    // 4–7 cm
            double tinggiLimas = 6 + Math.random() * 5;        // 6–11 cm
            double tinggiSisiTegak1 = 5 + Math.random() * 5;   // 5–10 cm
            double tinggiSisiTegak2 = 5 + Math.random() * 5;

            // === POLYMORPHISM ===
            Trapesium limas = new LimasTrapesium(sisi1, sisi2, tinggiTrapesium, tinggiLimas, tinggiSisiTegak1, tinggiSisiTegak2);

            double luas = limas.hitungLuas();
            double keliling = limas.hitungKeliling();

            double luasAlas = 0.5 * (sisi1 + sisi2) * tinggiTrapesium;

            if (limas instanceof LimasTrapesium) {
                double volumeOverload = ((LimasTrapesium) limas).hitungVolume(luasAlas, tinggiLimas);
                double luasPermukaanOverload = ((LimasTrapesium) limas).hitungLuasPermukaan(
                    luasAlas,
                    sisi1, tinggiSisiTegak1,
                    sisi2, tinggiSisiTegak2,
                    Math.abs(sisi1 - sisi2) / 2.0,
                    tinggiSisiTegak2
                );

                System.out.printf("Luas Permukaan Limas Trapesium (overload): %.2f cm²%n", luasPermukaanOverload);
                System.out.printf("Volume Limas Trapesium (overload): %.2f cm³%n", volumeOverload);
            }

            System.out.printf("Loop-%d%n", i + 1);
            System.out.printf("sisi1=%.2f, sisi2=%.2f, tinggiTrapesium=%.2f, tinggiLimas=%.2f%n",
                              sisi1, sisi2, tinggiTrapesium, tinggiLimas);
            System.out.printf("Luas Trapesium: %.2f cm²%n", luas);
            System.out.printf("Keliling Trapesium: %.2f cm%n", keliling);
            System.out.println("----------------------------------------------------------");
        }

    } else if (multithread == 1) {
        System.out.println("*** Limas Trapesium (Multi-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 1; i <= jumlahLooping; i++) {
            Thread t = new Thread(new LimasTrapesiumThread(i));
            t.start();
        }
    }

    loop = false;
    break;

                            
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
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                    multithread = inputUser.nextInt();
                    jumlahLooping = 0;
                    
                    if(multithread == 1) {
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
                        Thread t = new Thread(new PrismaJajarGenjangThread(i));  // kirim nomor urut i
                        t.start();
                    }   
                        
                    // polymorphism di single thread
                    } else if (multithread == 0) {
                         System.out.println("*** Tembereng Lingkaran***");
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
                    
                    // Menjalankan perhitungan lingkaran sebanyak jumlahLooping kali (tanpa thread)
                           for (int i = 0; i < jumlahLooping; i++) {
                                try {
                                    double alas = 5 + Math.random() * 20;              // 5 - 25
                                    double tinggi = 5 + Math.random() * 20;  
                                    double tinggiPrisma = 5 + Math.random() * 20; // 5 - 25
                                    double sisiMiring = 5 + Math.random() * 20;        // 5 - 25
                                    double sudutDerajat = 30 + Math.random() * 60; 

                                    JajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(alas, tinggi, sisiMiring, tinggiPrisma);

                                    double luas = prismaJajarGenjang.hitungLuas(alas, tinggi, sisiMiring);
                                    double keliling = prismaJajarGenjang.hitungKeliling(alas, sisiMiring);

                                    if (prismaJajarGenjang instanceof PrismaJajarGenjang) {
                                        double luasTembereng = prismaJajarGenjang.hitungLuas();
                                        double kelilingTembereng = prismaJajarGenjang.hitungKeliling();

                                        System.out.printf("Luas Prisma Jajar Genjang (overload): %.2f cm²%n", luasTembereng);
                                        System.out.printf("Keliling Prisma Jajar Genjang (overload): %.2f cm%n", kelilingTembereng);
                                    }

                                    System.out.printf("Loop-%d | alas : %.2f | tinggi : %.2f | sisi miring : %.2f | sudut derajat: %.2f | Luas Jajar Genjang : %.2f | Keliling Jajar Genjang: %.2f%n%n",
                                            (i + 1), alas, tinggi, sisiMiring, sudutDerajat, luas, keliling);

                                } catch (IllegalArgumentException e) {
                                    System.err.printf("Loop-%d ERROR: %s%n%n", i + 1, e.getMessage());
                                } catch (Exception e) {
                                    System.err.printf("Loop-%d ERROR TAK TERDUGA: %s%n%n", i + 1, e.getMessage());
                                }
                            }


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
                            loop = false;
                            break;
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
                            loop = false;
                            break;
                case 28:
                    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread(0)? (1/0)");
                        multithread = inputUser.nextInt();
                        jumlahLooping = 0;

                        if (multithread == 0) {
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

                            // Menjalankan perhitungan lingkaran sebanyak jumlahLooping kali (tanpa thread)
                            for (int i = 0; i < jumlahLooping; i++) {
                                double jariJari = 5 + Math.random() * 20; 
                                double tinggi = 5 + Math.random() * 20;// 5 - 25
                                Lingkaran tabung = new Tabung(jariJari, tinggi);

                                tabung = new Tabung(jariJari, tinggi);
                                double luas = tabung.hitungLuas(jariJari);
                                double keliling = tabung.hitungKeliling(jariJari);
                                
                                 if (tabung instanceof Tabung) {
                                    double luasPermukaanOverload = ((Tabung) tabung).hitungLuasPermukaan(jariJari, tinggi);
                                    double volumeOverload = ((Tabung) tabung).hitungVolume(jariJari, tinggi);

                                    System.out.printf("Luas Permukaan Tabung (overload): %.2f cm²%n", luasPermukaanOverload);
                                    System.out.printf("Volume Tabung (overload): %.2f cm³%n", volumeOverload);
                                }

                                System.out.printf("Loop-%d | Jari-jari: %.2f | Luas lingkaran : %.2f | Keliling lingkaran: %.2f%n%n",
                                        (i + 1), jariJari, luas, keliling);
                            }
                        } else if (multithread == 1) {
                            System.out.println("*** Tabung (Multi-threaded) ***");
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
                                Thread t = new Thread(new TabungThread(i));  // kirim nomor urut i
                                t.start();
                            }
                        }
                        loop = false;
                        break;
                case 29:
    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread (0)? (1/0)");
    multithread = inputUser.nextInt();
    jumlahLooping = 0;

    if (multithread == 0) {
        System.out.println("*** Cincin Bola (Single-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 0; i < jumlahLooping; i++) {
            double jariJari = 2 + Math.random() * 8;
            double jariJariMajor = 3 + Math.random() * 7;

            // POLYMORPHISM
            Bola cincin = new CincinBola(jariJari, jariJariMajor);

            System.out.printf("Loop-%d%n", i + 1);
            System.out.printf("Jari-jari Bola: %.2f cm%n", jariJari);
            System.out.printf("Jari-jari Major (Cincin Bola): %.2f cm%n", jariJariMajor);

            // Override
            double volume = cincin.hitungVolume();
            double luasPermukaan = cincin.hitungLuasPermukaan();

            // Hitung volume dan luas bola saja
            Bola bola = new Bola(jariJari);
            double volumeBola = bola.hitungVolume();
            double luasBola = bola.hitungLuasPermukaan();

            System.out.printf("Volume Cincin Bola (override): %.2f cm³%n", volume);
            System.out.printf("Luas Permukaan Cincin Bola (override): %.2f cm²%n", luasPermukaan);

            if (cincin instanceof CincinBola) {
                double volumeOL = ((CincinBola) cincin).hitungVolume(jariJari, jariJariMajor);
                double luasOL = ((CincinBola) cincin).hitungLuasPermukaan(jariJari, jariJariMajor);

                System.out.printf("Volume Cincin Bola (overload): %.2f cm³%n", volumeOL);
                System.out.printf("Luas Permukaan Cincin Bola (overload): %.2f cm²%n", luasOL);
            }

            System.out.printf("Volume Bola: %.2f cm³%n", volumeBola);
            System.out.printf("Luas Permukaan Bola: %.2f cm²%n", luasBola);
            System.out.println("----------------------------------------------------------");
        }

    } else if (multithread == 1) {
        System.out.println("*** Cincin Bola (Multi-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 1; i <= jumlahLooping; i++) {
            Thread t = new Thread(new CincinBolaThread(i));
            t.start();
        }
    }

    loop = false;
    break;

                case 30:
    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread (0)? (1/0)");
    multithread = inputUser.nextInt();
    jumlahLooping = 0;

    if (multithread == 0) {
        System.out.println("*** Juring Bola (Single-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 0; i < jumlahLooping; i++) {
            double jariJari = 4 + Math.random() * 6;
            double tinggi = Math.random() * (2 * jariJari);

            Bola juring = new JuringBola(jariJari, tinggi);

            System.out.printf("Loop-%d%n", i + 1);
            System.out.printf("Jari-jari Bola: %.2f cm%n", jariJari);
            System.out.printf("Tinggi Juring: %.2f cm%n", tinggi);

            // Hitung Juring Bola
            double volume = juring.hitungVolume();
            double luasPermukaan = juring.hitungLuasPermukaan();

            // Hitung Juring Bola (overload)
            if (juring instanceof JuringBola) {
                double volumeOL = ((JuringBola) juring).hitungVolume(jariJari, tinggi);
                double luasOL = ((JuringBola) juring).hitungLuasPermukaan(jariJari, tinggi);

                System.out.printf("Volume Juring Bola (overload): %.2f cm³%n", volumeOL);
                System.out.printf("Luas Permukaan Juring Bola (overload): %.2f cm²%n", luasOL);
            }

            // Hitung Bola utuh
            Bola bola = new Bola(jariJari);
            double volumeBola = bola.hitungVolume();
            double luasBola = bola.hitungLuasPermukaan();

            System.out.printf("Volume Juring Bola (override): %.2f cm³%n", volume);
            System.out.printf("Luas Permukaan Juring Bola (override): %.2f cm²%n", luasPermukaan);
            System.out.printf("Volume Bola Penuh: %.2f cm³%n", volumeBola);
            System.out.printf("Luas Permukaan Bola Penuh: %.2f cm²%n", luasBola);
            System.out.println("----------------------------------------------------------");
        }

    } else if (multithread == 1) {
        System.out.println("*** Juring Bola (Multi-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 1; i <= jumlahLooping; i++) {
            Thread t = new Thread(new JuringBolaThread(i));
            t.start();
        }
    }

    loop = false;
    break;
  
                case 31:
    System.out.println("Jalankan secara multi-thread (1) atau secara single-thread (0)? (1/0)");
    multithread = inputUser.nextInt();
    jumlahLooping = 0;

    if (multithread == 0) {
        System.out.println("*** Tembereng Bola (Single-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 0; i < jumlahLooping; i++) {
            double jariJari = 5 + Math.random() * 5; // 5 - 10
            double tinggi = Math.random() * jariJari;

            Bola tembereng = new TemberengBola(jariJari, tinggi);

            System.out.printf("Loop-%d%n", i + 1);
            System.out.printf("Jari-jari Bola: %.2f cm%n", jariJari);
            System.out.printf("Tinggi Tembereng: %.2f cm%n", tinggi);

            // Hitung Tembereng Bola
            double volume = tembereng.hitungVolume();
            double luas = ((TemberengBola) tembereng).hitungLuas();

            // Hitung Overload
            double volumeOverload = ((TemberengBola) tembereng).hitungVolume(jariJari, tinggi);
            double luasOverload = ((TemberengBola) tembereng).hitungLuas(jariJari, tinggi);

            // Hitung Bola utuh
            Bola bola = new Bola(jariJari);
            double volumeBola = bola.hitungVolume();
            double luasPermukaanBola = bola.hitungLuasPermukaan();

            // Cetak
            System.out.printf("Volume Tembereng Bola (override): %.2f cm³%n", volume);
            System.out.printf("Volume Tembereng Bola (overload): %.2f cm³%n", volumeOverload);
            System.out.printf("Luas Permukaan Tembereng Bola (override): %.2f cm²%n", luas);
            System.out.printf("Luas Permukaan Tembereng Bola (overload): %.2f cm²%n", luasOverload);
            System.out.printf("Volume Bola Penuh: %.2f cm³%n", volumeBola);
            System.out.printf("Luas Permukaan Bola Penuh: %.2f cm²%n", luasPermukaanBola);
            System.out.println("----------------------------------------------------------");
        }

    } else if (multithread == 1) {
        System.out.println("*** Tembereng Bola (Multi-threaded) ***");

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
                inputUser.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                inputUser.nextLine();
            }
        }

        for (int i = 1; i <= jumlahLooping; i++) {
            Thread t = new Thread(new TemberengBolaThread(i));
            t.start();
        }
    }

    loop = false;
    break;

                case 32:
                    System.out.println("*** Banyak Geometri (Multi-threaded dengan Thread Pool) ***");

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
                        executor.execute(new bendageometri.PrismaJajarGenjangThread(i));
                        executor.execute(new bendageometri.TemberengLingkaranThread(i));
                    }

                    // Setelah submit semua, shutdown executor agar program bisa selesai
                    executor.shutdown();
                    
                   
                    loop = false;
                    break;
                case 33:
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
