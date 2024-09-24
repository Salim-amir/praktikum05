import java.util.Scanner;

public class PemilihanHariDenganIf16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int hari = input.nextInt();

        String jenisHari;
        if (hari >= 1 && hari <= 5) {
            jenisHari = "Weekday";
        } else if (hari == 6 || hari == 7) {
            jenisHari = "Weekend";
        } else {
            jenisHari = "Invalid Number";
        }

        System.out.println(jenisHari);
    }
}