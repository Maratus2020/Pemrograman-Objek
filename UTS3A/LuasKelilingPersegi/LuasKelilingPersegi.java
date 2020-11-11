
package LuasKelilingPersegi;

import java.util.Scanner;

public class LuasKelilingPersegi {

    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        int sisi = 17;
        int Luas,Keliling;
        
        Luas = sisi*sisi;
        System.out.println("Luas Persegi adalah " + Luas);
        Keliling = 4*sisi;
        System.out.println("Keliling Persegi adalah " + Keliling);
    }
    
}
