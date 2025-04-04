
package latihan_tugas;

// Import library Scanner untuk membaca input dari keyboard
import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input user
        // Materi: Object & Library
        Scanner input = new Scanner(System.in);

        // Program meminta user untuk memasukkan bilangan bulat n. 
        //Nilai n digunakan sebagai batas deret angka yang akan ditampilkan.

        System.out.print("Bilangan : ");
        int n = input.nextInt(); // Input untuk batas deret angka

        //Deret angka dari 1 sampai n ditampilkan dalam format 5 kolom per baris. 
        //Ketika i habis dibagi 5, program akan pindah ke baris baru.

        int kolom = 5; // Jumlah angka per baris ( 5 kolom)

        // Menampilkan angka dalam format 5 kolom
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " "); // Tampilkan angka

            // Pindah baris setiap 5 angka
            if (i % kolom == 0) {
                System.out.println(); // Ganti baris
            }
        }

        // Membuat garis pemisah antar dua output
        System.out.println("\n------------------");

        // Meminta user untuk menentukan berapa banyak angka per baris sesuai keinginan.
        System.out.print("Dipecah : ");
        int p = input.nextInt(); // Jumlah kolom yang diinginkan user

        //Proses serupa seperti bagian sebelumnya,
        // namun kali ini jumlah kolom ditentukan oleh user melalui input p.
        // Menampilkan angka dalam jumlah kolom sesuai input user
        int count = 1; // Variabel bantu untuk menghitung angka per baris
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            
            // Pindah baris setiap p angka
            if (count % p == 0) {
                System.out.println();
            }
            count++; // Increment counter
        }
        input.close();
    }
}
