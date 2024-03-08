/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

import bangunDatar.PersegiPanjang;
import bangunRuang.Balok;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        
//        System.out.print("Input Panjang : ");
//        x = scanner.nextDouble();
//        System.out.print("Input Lebar : ");
//        y = scanner.nextDouble();
//        System.out.print("Input Tinggi : ");
//        z = scanner.nextDouble();
        
        PersegiPanjang persegi1 = new PersegiPanjang(10,13);
        System.out.println("Keliling persegi = " + persegi1.Keliling());
        System.out.println("Luas persegi = " + persegi1.Luas());
        
//        Balok balok1 = new Balok(x,y,z);
//        System.out.println("Volume Balok = "+ balok1.Volume());
        
//        System.out.println("Panjang : " + persegi1.getPanjang());
        
//        persegi1.panjang =;
//        persegi1.setPanjang(15);
//        System.out.println("Panjang : " + persegi1.getPanjang());
    }
    
}
