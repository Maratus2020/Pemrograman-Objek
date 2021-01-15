
package com.dicoding.javafundamental.inputoutput2;

import java.io.File;

public class Mkdir {

    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);
        // Buat directory
        file.mkdirs();
    }
    
}
