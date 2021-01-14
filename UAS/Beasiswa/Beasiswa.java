/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beasiswa;

/**
 *
 * @author Asus
 */
public class Beasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nama = "Maratus Sholiha",
                NIM = "201969040017",
                Jurusan = "Teknik Informatika",
                Semester = "3",
                Kelas = "A";
        double BD = 4*4; //jumlah (SKS x Poin)
        double JK = 5*4; //jumlah (SKS x Poin)
        double PO = 4*4; //jumlah (SKS x Poin)
        double IMK = 3*3; //jumlah (SKS x Poin)
        double SP = 3*4; //jumlah (SKS x Poin)
        double SKS = 19; //jumlah SKS
        double JumlahKumulatif, IPK;
        JumlahKumulatif = BD + JK + PO + IMK + SP;
        IPK = JumlahKumulatif/SKS;
        
        System.out.println("Nama                       : " + Nama);
        System.out.println("NIM                        : " + NIM);
        System.out.println("Jurusan                    : " + Jurusan);
        System.out.println("Kelas                      : " + Semester + Kelas);
        System.out.println("Nilai MK-Basis Data        : " + BD);
        System.out.println("Nilai MK-Jaringan Komputer        : " + JK);
        System.out.println("Nilai MK-Pemrograman Objek : " + PO);
        System.out.println("Nilai MK-Interaksi Manusia dan Komputer : " + IMK);
        System.out.println("Nilai MK-Statistika dan Probabilitas : " + SP);
        System.out.println("Nilai IPK                  : " + IPK);
        
        if (IPK >= 3.25) {
            System.out.println("Selamat Anda Menerima Beasiswa");
        } else if (IPK < 3.25)
        {
            System.out.println("Maaf Anda Tidak Mendapat Beasiswa");
        }
    }
}
