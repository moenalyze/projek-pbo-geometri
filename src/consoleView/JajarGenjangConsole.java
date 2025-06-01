/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleView;

import bendageometri.JajarGenjang;
import java.util.Scanner;

/**
 *
 * @author Maan
 */


public class JajarGenjangConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        
        double alas = 0;
        double tinggi = 0;
        double sudutLancip = 0;
        
        System.out.println("*** Jajar Genjang ***");
        
        while(true) {
          try {
            System.out.print("Masukkan alas : ");
            alas = Double.parseDouble(input.nextLine());
            break;
          } catch(NumberFormatException e) {
             System.out.println("Input alas harus berupa angka. Silakan coba lagi.");
          } catch (Exception e) {
            System.out.println("Terjadi kesalahan" + e.getMessage());
          }
        }
        
        while (true) {            
          try {
            System.out.print("Masukkan tinggi : ");
            tinggi = Double.parseDouble(input.nextLine());    
            break;
           } catch(NumberFormatException e) {
             System.out.println("Input tinggi harus berupa angka. Silakan coba lagi.");
           } catch (Exception e) {
            System.out.println("Terjadi kesalahan" + e.getMessage());
           }
        }
        
        while (true) {            
           try {
            System.out.print("Masukkan besar sudut : ");
            sudutLancip = Double.parseDouble(input.nextLine());    
            break;
           } catch(NumberFormatException e) {
             System.out.println("Input sudut harus berupa angka. Silakan coba lagi.");
           } catch (Exception e) {
            System.out.println("Terjadi kesalahan" + e.getMessage());
           }
        }
        
        JajarGenjang jajarGenjang = new JajarGenjang(alas, tinggi, sudutLancip);
        double luas = jajarGenjang.hitungLuas();
        double keliling = jajarGenjang.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Jajar Genjang    : " + luas);
        System.out.println("Keliling Jajar Genjang : " + keliling);
    }
}