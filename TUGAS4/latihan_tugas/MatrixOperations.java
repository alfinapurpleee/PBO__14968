package latihan_tugas;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran matriks A
        System.out.print("Masukkan jumlah baris matriks A: ");
        int barisA = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        int kolomA = scanner.nextInt();

        // Deklarasi dan inisialisasi array 2 dimensi untuk matriks A
        int[][] matrixA = new int[barisA][kolomA];
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("Elemen A[" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt(); // Input tiap elemen
            }
        }

        // Input ukuran matriks B
        System.out.print("Masukkan jumlah baris matriks B: ");
        int barisB = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        int kolomB = scanner.nextInt();

        // Deklarasi dan inisialisasi array 2 dimensi untuk matriks B
        int[][] matrixB = new int[barisB][kolomB];
        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("Elemen B[" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt(); // Input tiap elemen
            }
        }

        // Variabel hasil penjumlahan akan digunakan saat operasi penjumlahan
        int[][] hasilPenjumlahan = null;
        int pilihan;

        // Menu operasi matriks menggunakan perulangan do-while
        do {
            System.out.println("\nMenu Operasi Matriks:");
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Perkalian Matriks");
            System.out.println("3. Transpos Hasil Penjumlahan ke C");
            System.out.println("4. Transpos Matriks A ke C");
            System.out.println("5. Transpos Matriks B ke C");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Penjumlahan matriks hanya bisa dilakukan jika ukuran sama
                    if (barisA == barisB && kolomA == kolomB) {
                        hasilPenjumlahan = new int[barisA][kolomA];
                        for (int i = 0; i < barisA; i++) {
                            for (int j = 0; j < kolomA; j++) {
                                hasilPenjumlahan[i][j] = matrixA[i][j] + matrixB[i][j];
                            }
                        }
                        System.out.println("Hasil Penjumlahan Matriks A + B:");
                        cetakMatriks(hasilPenjumlahan);
                    } else {
                        System.out.println("Penjumlahan tidak dapat dilakukan karena ukuran matriks berbeda.");
                    }
                    break;

                case 2:
                    // Perkalian matriks: jumlah kolom A harus sama dengan jumlah baris B
                    if (kolomA == barisB) {
                        int[][] hasilPerkalian = new int[barisA][kolomB];
                        for (int i = 0; i < barisA; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                hasilPerkalian[i][j] = 0; // Inisialisasi elemen hasil
                                for (int k = 0; k < kolomA; k++) {
                                    hasilPerkalian[i][j] += matrixA[i][k] * matrixB[k][j];
                                }
                            }
                        }
                        System.out.println("Hasil Perkalian Matriks A * B:");
                        cetakMatriks(hasilPerkalian);
                    } else {
                        System.out.println("Perkalian tidak dapat dilakukan karena jumlah kolom A tidak sama dengan jumlah baris B.");
                    }
                    break;

                case 3:
                    // Transpos dari hasil penjumlahan
                    if (hasilPenjumlahan != null) {
                        System.out.println("Hasil Transpos dari Penjumlahan Matriks A + B ke C:");
                        int[][] transposC = transposMatriks(hasilPenjumlahan, barisA, kolomA);
                        cetakMatriks(transposC);
                    } else {
                        System.out.println("Silakan lakukan penjumlahan terlebih dahulu!");
                    }
                    break;

                case 4:
                    // Transpos Matriks A ke C
                    System.out.println("Hasil Transpos Matriks A ke C:");
                    int[][] transposA = transposMatriks(matrixA, barisA, kolomA);
                    cetakMatriks(transposA);
                    break;

                case 5:
                    // Transpos Matriks B ke C
                    System.out.println("Hasil Transpos Matriks B ke C:");
                    int[][] transposB = transposMatriks(matrixB, barisB, kolomB);
                    cetakMatriks(transposB);
                    break;

                case 6:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan pilih kembali.");
            }
        } while (pilihan != 6);
    }

    // Fungsi untuk melakukan transpose: baris jadi kolom dan sebaliknya
    static int[][] transposMatriks(int[][] matriks, int baris, int kolom) {
        int[][] hasil = new int[kolom][baris]; // Ukuran transpos = kolom x baris
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[j][i] = matriks[i][j]; // Tukar indeks
            }
        }
        return hasil;
    }

    // Fungsi bantu untuk mencetak matriks
    static void cetakMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println(); // Ganti baris
        }
    }
}