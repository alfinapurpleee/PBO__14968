package latihan_tugas;

import java.util.Scanner;

public class Latihan_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta user memasukkan bilangan
        System.out.print("Bilangan : ");
        int n = input.nextInt();
        
        long faktorial = 1; // Inisialisasi variabel faktorial
        
        // Loop untuk menghitung faktorial dan menampilkan proses perhitungannya
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                faktorial *= i; // Faktorial pertama (1)
            } else {
                System.out.println(faktorial + " x " + i + " = " + (faktorial * i));
                faktorial *= i; // Perkalian bertahap
            }
        }

        // Menampilkan hasil akhir
        System.out.println("Faktorial dari " + n + " adalah " + faktorial);

        input.close();
    }
}
