import java.util.Scanner;

public class ZonaDenyutJantung25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia (10-100) : ");
        int usia = sc.nextInt();
        System.out.print("Masukkan detak jantung saat latihan (HR): ");
        int HR = sc.nextInt();

        double MHR = 220 - usia;
        double persenMHR = (HR / MHR) * 100;

        String kategori;
        if (persenMHR < 50) {
            kategori = "Sangat ringan Pemanasan, manfaat minimal.";
        } else if (persenMHR < 60) {
            kategori = "Ringan Peningkatan dasar kebugaran.";
        } else if (persenMHR < 70) {
            kategori = "Sedang Zona aerobik nyaman.";
        } else if (persenMHR <= 85) {
            kategori = "Kuat Meningkatkan kapasitas kardiorespirasi.";
        } else {
            kategori = "Sangat berat Berisiko bagi pemula, batasi durasi.";
        }

        System.out.println("\n=== Hasil Evaluasi ===");
        System.out.println("Usia            : " + usia + " tahun");
        System.out.println("Detak jantung   : " + HR + " bpm");
        System.out.println("MHR (maksimum)  : " + MHR + " bpm");
        System.out.println("Persentase MHR  : " + Math.round(persenMHR) + "%");
        System.out.println("Kategori        : " + kategori);

        sc.close();
    }
}
