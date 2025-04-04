package latihan_tugas;

public class MatrixExample
 { // Perbaikan nama class (harus sesuai dengan nama file)
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 2D (matriks)
        int array[][] = { {1, 3, 5}, {2, 4, 6} };

        // Menampilkan jumlah baris (row) dalam array
        System.out.println("Row size = " + array.length);

        // Menampilkan jumlah kolom (column) dalam array
        System.out.println("Column size = " + array[1].length);

        // Memanggil metode untuk mencetak isi array
        outputArray(array);
    }

    // Metode untuk menampilkan isi array 2D
    public static void outputArray(int[][] array) {
        int rowSize = array.length;   // Menyimpan jumlah baris dalam array
        int columnSize = array[0].length; // Menyimpan jumlah kolom dalam array

        // Perulangan untuk menampilkan isi array dalam bentuk matriks
        for(int i = 0; i <= 1; i++) { // Looping untuk baris (row)
            System.out.print("[");
            for(int j = 0; j <= 2; j++) { // Looping untuk kolom (column)
                System.out.print(" " + array[i][j]); // Mencetak nilai elemen array
            }
            System.out.println(" ]"); // Pindah ke baris baru setelah mencetak satu baris matriks
        }
        System.out.println(); // Baris kosong untuk pemisah output
    }
}
