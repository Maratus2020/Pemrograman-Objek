
package MenghitungIPK;

public class MenghitungIPK {

    public static void main(String[] args) {
        String Nama = "Maratus Sholiha",
                NIM = "201969040017",
                Jurusan = "Teknik Informatika",
                Semester = "3",
                Kelas = "A";
        int OOP = 70;
        int BS = 85;
        int JK = 80;
        int IP, TotalNilaiMK;
        TotalNilaiMK = OOP + BS + JK;
        IP = TotalNilaiMK/3;
        
        System.out.println("Nama                       : " + Nama);
        System.out.println("NIM                        : " + NIM);
        System.out.println("Jurusan                    : " + Jurusan);
        System.out.println("Kelas                      : " + Semester + Kelas);
        System.out.println("Nilai MK-OOP               : " + OOP);
        System.out.println("Nilai MK-Basis Data        : " + BS);
        System.out.println("Nilai MK-Jaringan Komputer : " + JK);
        System.out.println("Nilai Total Mata Kuliah    : " + TotalNilaiMK);
        System.out.println("Nilai IP                   : " + IP);
        
        char Predikat;
        if(IP >=81) {
            Predikat = 'A';
        }else if (IP >=61){
            Predikat = 'B';
        }else if (IP <=60){
            Predikat = 'C';
        }else
            Predikat = 'D';
        System.out.println("Selamat Anda Mendapatkan Predikat " + Predikat);
    }
    
}
