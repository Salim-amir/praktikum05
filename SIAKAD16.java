import java.util.Scanner;

public class SIAKAD16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String nama , nim;
        char kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiakhir;

        System.out.println("Masukkan nama");
        nama = sc.nextLine();
        System.out.println("Masukkan nim");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan absen");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis");
        nilaikuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas");
        nilaitugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian");
        nilaiujian = sc.nextDouble();

        nilaiakhir = (nilaikuis + nilaitugas + nilaiujian ) / 3;
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiakhir);

        String nilaiHuruf = "";
        double nilaiSetara = 0.0;
        String kualifikasi = "";

        if (nilaiakhir >= 80 && nilaiakhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat Baik";
        } else if (nilaiakhir >= 73 && nilaiakhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiakhir >= 65 && nilaiakhir < 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik";
        } else if (nilaiakhir >= 60 && nilaiakhir < 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiakhir>= 50 && nilaiakhir < 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            kualifikasi = "Cukup";
        } else if (nilaiakhir>= 39 && nilaiakhir < 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1.0;
            kualifikasi = "Kurang";
        } else if (nilaiakhir >= 0 && nilaiakhir <= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0.0;
            kualifikasi = "Gagal";
        } else {
            System.out.println("Nilai tidak valid!");
        }
    
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Nilai Setara: " + nilaiSetara);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}