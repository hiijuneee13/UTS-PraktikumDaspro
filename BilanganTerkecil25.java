import java.util.Scanner;

public class BilanganTerkecil25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = sc.nextInt();

        int terkecil = a;
        if (b < terkecil) terkecil = b;
        if (c < terkecil) terkecil = c;

        System.out.println("\nBilangan terkecil adalah: " + terkecil);

        if ((a == terkecil && b == terkecil) || (a == terkecil && c == terkecil) || (b == terkecil && c == terkecil)) {
            System.out.println("Ada beberapa angka yang sama dan merupakan nilai terkecil.");
        }

        sc.close();
    }
}
