/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.PersegiPanjang;

/**
 *
 * @author Lenovo
 */
public class Balok extends PersegiPanjang {
    // attribute
    double tinggi;
    
    // constructor
    public Balok(double p, double l, double t){
        super(p, l);
        this.tinggi = t;
    }
    
    // method
    public double Volume(){
        return super.Luas() * tinggi;
//        return getLebar() * getPanjang() * tinggi;
//        return super.lebar * super.panjang * tinggi;
    }
}
