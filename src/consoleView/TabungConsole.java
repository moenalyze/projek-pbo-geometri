/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleView;

import java.util.Scanner;
import bendageometri.Tabung;

/**
 *
 * @author Maan
 */
public class TabungConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        
        double jariJari = 0;
        double tinggiTabung = 0;
        
        System.out.println("*** Tabung ***");
        
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
        
        while (true) {            
          try {
            System.out.print("Masukkan tinggi tabung (cm) : ");
            tinggiTabung = Double.parseDouble(input.nextLine());    
            break;
           } catch(NumberFormatException e) {
             System.out.println("Input tinggi harus berupa angka. Silakan coba lagi.");
           } catch (Exception e) {
            System.out.println("Terjadi kesalahan" + e.getMessage());
           }
        }
        
            Tabung tabung = new Tabung(jariJari, tinggiTabung);
            double luasPermukaan = tabung.hitungLuasPermukaan();
            double volume = tabung.hitungVolume();

            System.out.println();
            System.out.println("---Hasil Perhitungan---");

            System.out.println("Luas permukaan tabung    : " + luasPermukaan);
            System.out.println("Volume tabung: " + volume);
    }
}