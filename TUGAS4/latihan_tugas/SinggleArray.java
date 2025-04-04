package latihan_tugas; // Package tempat file berada (opsional untuk pengelompokan)

// Nama kelas harus sama dengan nama file (SinggleArray.java)
public class SinggleArray 
{
    public static void main(String[] args) {

        // Deklarasi array bertipe integer (cara 1)
        int [] x;
        
        // Inisialisasi array untuk 3 elemen (indeks 0, 1, 2)
        x = new int[3]; 
        
        // Mengisi elemen array satu per satu
        x[0] = 20;    // Elemen pertama
        x[1] = 10;    // Elemen kedua
        x[2] = 30;    // Elemen ketiga

        // Menampilkan isi array ke layar
        System.out.println("Nilai x[0] : " + x[0]);
        System.out.println("Nilai x[1] : " + x[1]);
        System.out.println("Nilai x[2] : " + x[2]);
    }
}