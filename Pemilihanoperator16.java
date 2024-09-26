import java.util.Scanner;

public class Pemilihanoperator16  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        int hasil = 0;

        if (operator == '+') {
            hasil = a + b;
        } else if (operator == '-') {
            hasil = a - b;
        } else if (operator == '*') {
            hasil = a * b;
        } else if (operator == '/') {
            hasil = a / b;
        } else {
            System.out.println("Operator yang dipilih tidak sesuai. Silakan memilih operator yang valid (+, -, *, /).");
        }

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
        }
    }
}