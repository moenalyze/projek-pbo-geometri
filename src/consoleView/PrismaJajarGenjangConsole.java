/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleView;

import java.util.Scanner;
import bendageometri.PrismaJajarGenjang;

/**
 *
 * @author Maan
 */

// paramater di constructor yang PrismaJajarGenjang sebelumnya tinggiPrismajajarGenjan harus diganti jadi tinggiPrismaJajarGenjang
public class PrismaJajarGenjangConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        
        double alas = 0;
        double tinggi = 0;
        double sudutLancip = 0;
        double tinggiPrisma = 0;
        
        System.out.println("*** Prisma Jajar Genjang ***");
        
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
        
        while (true) {            
           try {
            System.out.print("Masukkan tinggi prisma : ");
            tinggiPrisma = Double.parseDouble(input.nextLine());    
            break;
           } catch(NumberFormatException e) {
             System.out.println("Input tinggi harus berupa angka. Silakan coba lagi.");
           } catch (Exception e) {
            System.out.println("Terjadi kesalahan" + e.getMessage());
           }
        }
        
        PrismaJajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(alas, tinggi, sudutLancip, tinggiPrisma);
        double luasPermukaan = prismaJajarGenjang.hitungLuasPermukaan();
        double volume = prismaJajarGenjang.hitungVolume();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas permukaan prisma Jajar Genjang    : " + luasPermukaan);
        System.out.println("Volume prisma Jajar Genjang : " + volume);
    }
}