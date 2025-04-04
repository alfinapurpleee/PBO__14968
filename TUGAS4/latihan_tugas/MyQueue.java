// Deklarasi package sesuai dengan struktur proyek
package latihan_tugas;

// Import library yang dibutuhkan
import java.util.LinkedList;  // Menggunakan LinkedList sebagai implementasi Queue
import java.util.Queue;       // Interface Queue untuk operasi antrian
import java.util.Scanner;     // Scanner untuk input dari pengguna

/**
 * Program ini mengimplementasikan struktur data Queue (Antrian) menggunakan LinkedList.
 * Queue bekerja dengan prinsip FIFO (First In First Out).
 */
public class MyQueue {
    public static void main(String[] args) {
        // Deklarasi Queue menggunakan LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        int choice; // Variabel untuk menyimpan pilihan menu

        do {
            // Menampilkan menu operasi Queue dalam Bahasa Indonesia
            System.out.println("\nOperasi Antrian:");
            System.out.println("1. Tambah (Menambahkan elemen ke antrian)");
            System.out.println("2. Hapus (Menghapus elemen dari antrian)");
            System.out.println("3. Lihat depan (Melihat elemen paling depan)");
            System.out.println("4. Cek kosong (Memeriksa apakah antrian kosong)");
            System.out.println("5. Cek penuh (Tidak berlaku untuk LinkedList)");
            System.out.println("6. Ukuran (Menampilkan jumlah elemen dalam antrian)");
            System.out.print("Pilihan Anda? ");
            choice = scanner.nextInt(); // Membaca pilihan pengguna

            // Switch-case untuk menangani operasi berdasarkan pilihan pengguna
            switch (choice) {
                case 1: // Tambah: Memasukkan beberapa elemen ke dalam antrian sekaligus
                    System.out.print("Masukkan angka yang ingin ditambahkan (pisahkan dengan spasi): ");
                    scanner.nextLine(); // Membersihkan buffer
                    String inputLine = scanner.nextLine(); // Membaca seluruh baris input
                    String[] numbers = inputLine.split(" "); // Memisahkan angka berdasarkan spasi
                    for (String num : numbers) {
                        try {
                            queue.add(Integer.parseInt(num)); // Menambahkan setiap angka ke antrian
                        } catch (NumberFormatException e) {
                            System.out.println("Input '" + num + "' bukan angka yang valid, dilewati.");
                        }
                    }
                    break;
                case 2: // Hapus elemen terdepan dari antrian
                    if (!queue.isEmpty()) {
                        System.out.println("Elemen yang dihapus: " + queue.poll());
                    } else {
                        System.out.println("Antrian kosong, tidak ada elemen yang dapat dihapus.");
                    }
                    break;
                case 3: // Lihat elemen terdepan
                    if (!queue.isEmpty()) {
                        System.out.println("Elemen terdepan: " + queue.peek());
                    } else {
                        System.out.println("Antrian kosong, tidak ada elemen di depan.");
                    }
                    break;
                case 4: // Cek apakah antrian kosong
                    System.out.println("Antrian " + (queue.isEmpty() ? "kosong." : "tidak kosong."));
                    break;
                case 5: // Cek penuh (tidak berlaku)
                    System.out.println("Antrian menggunakan LinkedList, jadi ukurannya dinamis.");
                    break;
                case 6: // Tampilkan jumlah elemen dalam antrian
                    System.out.println("Ukuran = " + queue.size());
                    break;
                default: // Jika input tidak sesuai dengan menu
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka antara 1 sampai 6.");
            }

            // Menampilkan isi antrian saat ini dalam format yang sesuai dengan gambar
            System.out.print("\nQueue/Antrian = ");
            for (int item : queue) {
                System.out.print(item + " ");
            }
            System.out.println(); // Baris baru

            // Konfirmasi apakah pengguna ingin melanjutkan atau keluar dari program
            System.out.print("\nApakah Anda ingin melanjutkan? (Ketik y atau n): ");
        } while (scanner.next().equalsIgnoreCase("y")); // Program berjalan selama pengguna mengetik 'y'

        // Menutup scanner untuk menghindari kebocoran sumber daya
        scanner.close();
        System.out.println("\nProgram selesai. Terima kasih telah menggunakan antrian!");
    }
}
