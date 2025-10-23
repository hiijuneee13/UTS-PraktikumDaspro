import java.util.Scanner;

public class ZonaDenyutJantung25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input usia
        System.out.print("Masukkan usia (10-100): ");
        int usia = sc.nextInt();

        // Validasi batas usia tanpa looping
        if (usia < 10 || usia > 100) {
            System.out.println("Usia tidak masuk akal! Harus antara 10 dan 100 tahun.");
            sc.close();
            return; // langsung hentikan program
        }

        // Input detak jantung
        System.out.print("Masukkan detak jantung saat latihan (HR): ");
        int HR = sc.nextInt();

        // Validasi HR tanpa looping
        if (HR <= 0) {
            System.out.println(" Nilai detak jantung tidak boleh nol atau negatif!");
            sc.close();
            return; // hentikan program
        }

        // Hitung MHR dan persen MHR
        double MHR = 220 - usia;
        double persenMHR = (HR / MHR) * 100;

        // Tentukan kategori zona
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

        // Tampilkan hasil
        System.out.println("\n=== Hasil Evaluasi Zona Detak Jantung ===");
        System.out.println("Usia            : " + usia + " tahun");
        System.out.println("Detak jantung   : " + HR + " bpm");
        System.out.println("MHR (maksimum)  : " + MHR + " bpm");
        System.out.println("Persentase MHR  : " + Math.round(persenMHR) + "%");
        System.out.println("Kategori        : " + kategori);

        sc.close();
    }
}
