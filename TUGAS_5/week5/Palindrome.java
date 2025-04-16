package week5;

import java.util.Scanner;  // Mengimpor Scanner untuk menerima input dari pengguna

// Kelas Main (program utama)
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Membuat objek scanner untuk input dari pengguna

        // Meminta input dari pengguna
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();  // Menyimpan input pengguna ke dalam variabel 'input'

        // Membuat objek game dari kelas TextGame dan menampilkan hasilnya dengan kata yang dimasukkan pengguna
        TextGame game1 = new TextGame();
        game1.displayResult(input);  // Menggunakan input pengguna sebagai argumen

        System.out.println();

        // Membuat objek FancyTextGame dan menampilkan hasilnya dengan kata yang dimasukkan pengguna
        TextGame game2 = new FancyTextGame();
        game2.displayResult(input);  // Menggunakan input pengguna sebagai argumen

        scanner.close();  // Menutup scanner setelah penggunaan selesai
    }
}
