package latihan_tugas;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan jumlah data
        System.out.print("Jumlah Data : ");
        int jumlahData = input.nextInt();

        int[] data = new int[jumlahData]; // Deklarasi array dengan ukuran sesuai input user

        // Memasukkan data ke dalam array
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            data[i] = input.nextInt(); // Input nilai untuk setiap elemen array
        }

        System.out.println(); // Baris kosong untuk estetika

        // Menampilkan hasil nilai dalam array
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + data[i]);
        }

        input.close(); 
    }
}
