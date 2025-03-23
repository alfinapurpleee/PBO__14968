package week4;

class Array {
    public static void main(String[] args) {
        int[] angka = new int[6]; // Array integer dengan 6 elemen, default bernilai 0
        
        angka[1] = 6; // Index ke-1 diisi dengan angka 6, index lainnya tetap 0
        angka[5] = 3; // Index ke-5 diisi dengan angka 3

        // Menampilkan elemen array angka yang lebih dari 0
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > 0) {
                System.out.print(angka[i] + ", ");
            }
        }
        System.out.println();

        // Array string dengan beberapa elemen
        String[] kata = {"harimaw", "malaya", "sedang", "demam"};
        
        // Memodifikasi isi array
        kata[0] = "loreng";
        kata[1] = "putih";
        kata[3] = ""; // Kosongkan elemen index ke-3

        // Menampilkan isi array kata kecuali string kosong
        for (int i = 0; i < kata.length; i++) {      
            if (!kata[i].isEmpty()) { // Gunakan isEmpty() untuk mengecek string kosong
                System.out.print(kata[i] + ", ");
            }
        }
        System.out.println();

        // Array 2 dimensi (matriks)
        int[][] matriks = {
            {5, 4, 2, 1},
            {1, 6, 9, 3},
            {2, 0, 4, 9}
        };

        // Menampilkan elemen matriks
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println(); // Pindah ke baris baru untuk setiap baris matriks
        }
    }
}
