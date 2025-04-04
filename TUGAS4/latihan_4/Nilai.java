package latihan_4; //package 

import java.util.Scanner;

class Nilai { //ini class sama aja nama file yang sudah dibuat 
    private String nim, nama;
    private float nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    private char nHuruf;
    private String predikat;

    // Konstruktor
    public Nilai(String nim, String nama, float tugas, float uts, float uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;

        // Hitung nilai akhir dengan bobot
        this.nilaiAkhir = (tugas * 0.20f) + (uts * 0.35f) + (uas * 0.45f);
        this.nHuruf = getNilHuruf();
        this.predikat = getPredikat(nHuruf);
    }

    // Method untuk mendapatkan nilai huruf
    private char getNilHuruf() {
        if (nilaiAkhir >= 85)
            return 'A';
        else if (nilaiAkhir >= 70)
            return 'B';
        else if (nilaiAkhir >= 60)
            return 'C';
        else if (nilaiAkhir >= 40)
            return 'D';
        else
            return 'E';
    }

    // Method untuk mendapatkan predikat berdasarkan nilai huruf
    private String getPredikat(char huruf) {
        switch (huruf) {
            case 'A': return "Apik";
            case 'B': return "Baik";
            case 'C': return "Cukup";
            case 'D': return "Dablek";
            default: return "Elek";
        }
    }

    // Method untuk mencetak hasil
    public void cetakNilai() {
        System.out.println("\nNim            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.printf("Nilai Tugas    : %.2f * 20%% : %.2f%n", nilaiTugas, nilaiTugas * 0.20f);
        System.out.printf("Nilai UTS      : %.2f * 35%% : %.2f%n", nilaiUTS, nilaiUTS * 0.35f);
        System.out.printf("Nilai UAS      : %.2f * 45%% : %.2f%n", nilaiUAS, nilaiUAS * 0.45f);
        System.out.printf("Nilai Akhir    : %.6f%n", nilaiAkhir);
        System.out.println("Nilai Huruf    : " + nHuruf);
        System.out.println("Predikat       : " + predikat);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            // Input data
            System.out.print("Masukkan NIM           : ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama          : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Nilai Tugas   : ");
            float tugas = input.nextFloat();
            System.out.print("Masukkan Nilai UTS     : ");
            float uts = input.nextFloat();
            System.out.print("Masukkan Nilai UAS     : ");
            float uas = input.nextFloat();

            // Buat objek dan cetak hasil
            Nilai mahasiswa = new Nilai(nim, nama, tugas, uts, uas);
            mahasiswa.cetakNilai();

            // Tanya ulang
            System.out.print("\nInput data lagi [Y/T]? ");
            ulang = input.next().charAt(0);
            input.nextLine(); // Konsumsi newline

        } while (ulang == 'Y' || ulang == 'y');

        input.close();
    }
}
