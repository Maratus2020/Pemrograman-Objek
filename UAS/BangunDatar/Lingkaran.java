/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author Asus
 */
public class Lingkaran implements BangunDatar {
    private double pi = 3.14;
    Lingkaran(){
    }
    int s1 = 17;
    int s2 = 17;
    
    @Override
    public double luas (int s1, int s2){
        return 0;
    }
    @Override
    public double keliling (int s1, int s2){
        return 0;
    }
    public double luas (int r){
        return (pi*r*r);
    }
    public double keliling (int r){
         return (2*pi*r);
    }
}
