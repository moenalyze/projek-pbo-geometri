/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleView;

import java.util.Scanner;
import bendageometri.Bola;

/**
 *
 * @author Maan
 */
public class BolaConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        
        double jariJari = 0;
        
        System.out.println("*** Bola ***");
        
        while (true) {
            try {
                System.out.print("Masukkan jari-jari (cm): ");
                jariJari = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input jari-jari harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
               System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
         }
        
            Bola bola = new Bola(jariJari);
            double luasPermukaan = bola.hitungLuasPermukaan();
            double volume = bola.hitungVolume();

            System.out.println();
            System.out.println("---Hasil Perhitungan---");

            System.out.println("Luas permukaan Bola    : " + luasPermukaan);
            System.out.println("Volume bola : " + volume);
    }
}