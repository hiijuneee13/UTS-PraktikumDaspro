import java.util.Scanner;

public class KomisiPenjualan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan omzet (Rp): ");
        double omzet = sc.nextDouble();

        System.out.print("Masukkan rating (1-100): ");
        int rating = sc.nextInt();

        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
        String sertifikasi = sc.next().toLowerCase();

        double persenKomisi = 0;
        double bonus = 0;

        if (rating >= 70) {
            if (omzet < 50000000) {
                persenKomisi = 0.01;
            } else if (omzet < 100000000) {
                persenKomisi = 0.02;
            } else {
                persenKomisi = 0.03;
            }

            if (rating >= 90) {
                persenKomisi += 0.01;
            }

            if (sertifikasi.equals("ya")) {
                bonus = 500000;
            }
        }

        double totalKomisi = omzet * persenKomisi + bonus;

        System.out.println("\n=== Rincian Komisi ===");
        System.out.println("Omzet              : Rp " + omzet);
        System.out.println("Rating             : " + rating);
        System.out.println("Sertifikasi        : " + sertifikasi);
        System.out.println("Persentase Komisi  : " + (persenKomisi * 100) + "%");
        System.out.println("Bonus Sertifikasi  : Rp " + bonus);
        System.out.println("Total Komisi       : Rp " + totalKomisi);

        sc.close();
    }
}
