/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang implements HitungBidang{
    // attribut
    double panjang, lebar;
    
    // constructor
    public PersegiPanjang(double p, double l){
        this.panjang = p;
        this.lebar = l;
    }

    // setter and getter
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    //method
    @Override
    public double Luas() {
        return panjang * lebar;
    }

    @Override
    public double Keliling() {
        return 2 * (panjang + lebar);
    }
    
}
