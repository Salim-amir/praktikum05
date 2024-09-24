import java.util.Scanner;

public class Kafe16 {

    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        boolean keanggotaan; 
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, diskon = 0.1, totalHarga, nominalBayar;

        // Input data dari pengguna
        System.out.println("Apakah pelanggan member? (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Jumlah Kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Jumlah Teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Jumlah Roti: ");
        jmlRoti = input.nextInt();

        // Hitung total harga
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        // Hitung diskon jika pelanggan adalah anggota
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else {
            nominalBayar = totalHarga;
        }

        // Tampilkan hasil
        System.out.println("==============================");
        System.out.println("Detail Pembelian:");
        System.out.println("Kopi: " + jmlKopi + " x " + hargaKopi + " = " + (jmlKopi * hargaKopi));
        System.out.println("Teh: " + jmlTeh + " x " + hargaTeh + " = " + (jmlTeh * hargaTeh));
        System.out.println("Roti: " + jmlRoti + " x " + hargaRoti + " = " + (jmlRoti * hargaRoti));
        System.out.println("------------------------------");
        System.out.println("Total Harga: " + totalHarga);
        if (keanggotaan) {
            System.out.println("Diskon: " + (diskon * totalHarga));
        }
        System.out.println("Nominal yang Harus Dibayar: " + nominalBayar);
        System.out.println("==============================");
    }
}