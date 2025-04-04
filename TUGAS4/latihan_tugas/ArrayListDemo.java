package latihan_tugas; // Menentukan package agar program terorganisir

import java.util.ArrayList; // Mengimpor ArrayList untuk menyimpan data dinamis
import java.util.Scanner; // Mengimpor Scanner untuk input dari pengguna

public class ArrayListDemo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Meminta pengguna memasukkan jumlah data yang akan diproses
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        // Membuat ArrayList untuk menyimpan angka dari pengguna
        ArrayList<Integer> nilai1 = new ArrayList<>(); 
        ArrayList<Integer> nilai2 = new ArrayList<>();
        ArrayList<Integer> hasilJumlah = new ArrayList<>();
        ArrayList<Integer> hasilKurang = new ArrayList<>();
        ArrayList<Integer> hasilKali = new ArrayList<>();
        ArrayList<Double> hasilBagi = new ArrayList<>();

        // Memasukkan nilai pertama ke dalam ArrayList nilai1
        System.out.println("\nMasukkan Nilai 1:");
        for (int i = 0; i < jumlahData; i++) { // Loop sesuai jumlah data yang dimasukkan pengguna
            System.out.print("Index ke-" + i + ": ");
            nilai1.add(input.nextInt()); // Menambahkan nilai ke dalam ArrayList
        }

        // Memasukkan nilai kedua ke dalam ArrayList nilai2
        System.out.println("\nMasukkan Nilai 2:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Index ke-" + i + ": ");
            nilai2.add(input.nextInt()); // Menyimpan input ke dalam ArrayList nilai2
        }

        // Melakukan operasi matematika pada setiap elemen dalam ArrayList
        for (int i = 0; i < jumlahData; i++) {
            int a = nilai1.get(i); // Mengambil nilai dari ArrayList nilai1 pada indeks ke-i
            int b = nilai2.get(i); // Mengambil nilai dari ArrayList nilai2 pada indeks ke-i
            
            hasilJumlah.add(a + b); // Penjumlahan nilai1 dan nilai2
            hasilKurang.add(a - b); // Pengurangan nilai1 dan nilai2
            hasilKali.add(a * b);   // Perkalian nilai1 dan nilai2
            hasilBagi.add(b != 0 ? (double) a / b : 0); // Pembagian nilai1 dan nilai2, dengan pengecekan pembagian nol
        }

        // Menampilkan hasil operasi perhitungan
        System.out.println("\nHasil Perhitungan:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Index ke-" + i + ": ");
            System.out.println("Penjumlahan: " + hasilJumlah.get(i));
            System.out.println("Pengurangan: " + hasilKurang.get(i));
            System.out.println("Perkalian  : " + hasilKali.get(i));
            System.out.println("Pembagian  : " + hasilBagi.get(i)); // Menampilkan hasil pembagian
            System.out.println("----------------------");
        }

        input.close(); // Menutup Scanner untuk mencegah kebocoran resource
    }
}
