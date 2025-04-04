// PROGRAM MENAMPILKAN NILAI MAHASISWA MENGGUNAKAN METODE ARRAY LIST DENGAN ARRAY OBJEK  

package latihan_4; // package

import java.util.ArrayList;
import java.util.Scanner;

//DEKLARASI KELAS (Nilai2) 

class Nilai2 { //sama aja nama file yang telah dibuat 
    private String nim, nama;
    private float nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    private char nHuruf;
    private String predikat;

    // Konstruktor Kelas 

    public Nilai2(String nim, String nama, float tugas, float uts, float uas) {
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
    //METHOD (getNilHuruf== untuk menampilkan nilai dengan )
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

    // Method untuk mencetak hasil satu mahasiswa
    public void cetakNilai() {
        System.out.println("\nNIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.printf("Nilai Tugas    : %.2f * 20%% : %.2f%n", nilaiTugas, nilaiTugas * 0.20f);
        System.out.printf("Nilai UTS      : %.2f * 35%% : %.2f%n", nilaiUTS, nilaiUTS * 0.35f);
        System.out.printf("Nilai UAS      : %.2f * 45%% : %.2f%n", nilaiUAS, nilaiUAS * 0.45f);
        System.out.printf("Nilai Akhir    : %.6f%n", nilaiAkhir);
        System.out.println("Nilai Huruf    : " + nHuruf);
        System.out.println("Predikat       : " + predikat);
    }

    // Method untuk menampilkan daftar nilai semua mahasiswa
    public static void daftarNilai(ArrayList<Nilai2> listMahasiswa) {
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        for (Nilai2 mahasiswa : listMahasiswa) {
            mahasiswa.cetakNilai();
            System.out.println("---------------------------------");
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Merupakan bentuk array objek dinamis, karena kita menyimpan banyak objek bertipe Nilai2 dalam ArrayList.
        ArrayList<Nilai2> listMahasiswa = new ArrayList<>();
        char ulang;
        do {
            // Input data mahasiswa
            System.out.print("\nMasukkan NIM           : ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama          : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Nilai Tugas   : ");
            float tugas = input.nextFloat();
            System.out.print("Masukkan Nilai UTS     : ");
            float uts = input.nextFloat();
            System.out.print("Masukkan Nilai UAS     : ");
            float uas = input.nextFloat();

            // Buat objek mahasiswa dan simpan dalam list
            //Objek mahasiswa dimasukkan ke dalam list = inilah bentuk praktis array objek dengan ArrayList.
            Nilai2 mahasiswa = new Nilai2(nim, nama, tugas, uts, uas);
            listMahasiswa.add(mahasiswa);

            // Tanya ulang
            System.out.print("\nInput data lagi [Y/T]? ");
            ulang = input.next().charAt(0);
            input.nextLine(); 

        } while (ulang == 'Y' || ulang == 'y');

        // Tampilkan daftar nilai semua mahasiswa
        Nilai2.daftarNilai(listMahasiswa);

        input.close();
    }
}
