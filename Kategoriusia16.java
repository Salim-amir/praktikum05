import java.util.Scanner;

public class Kategoriusia16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input usia dari pengguna
        System.out.print("Masukkan usia Anda: ");
        
        // Validasi input: Pastikan input adalah angka positif
        if (input.hasNextInt()) {
            int usia = input.nextInt();

            // Validasi input: Pastikan usia tidak negatif
            if (usia >= 0) {
                // Menentukan kategori usia
                String kategori;
                if (usia <= 12) {
                    kategori = "Anak";
                } else if (usia <= 19) {
                    kategori = "Remaja";
                } else if (usia <= 64) {
                    kategori = "Dewasa";
                } else {
                    kategori = "Lansia";
                }

                // Menampilkan kategori usia
                System.out.println("Anda termasuk dalam kategori: " + kategori);
            } else {
                System.out.println("Usia tidak boleh negatif. Silahkan masukkan angka positif.");
            }
        } else {
            System.out.println("Input tidak valid. Silahkan masukkan angka usia.");
        }

        input.close();
    }
}