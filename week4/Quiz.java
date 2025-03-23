package week4;
import java.util.Scanner; // Mengimpor kelas Scanner untuk menerima input dari pengguna

public class Quiz {
    // Array yang berisi daftar pertanyaan
    private String[] questions = {
        "Tanggal berapa Indonesia merdeka",
        "Gunung tertinggi di dunia adalah?",
        "Berapa hasil dari Penjumlahan dari 25+25+25 =",
        "Siapa presiden pertama Indonesia?",
        "Apa makanan khas daerah Semarang",
        "Negara dengan jumlah penduduk terbanyak?",
        "Berapa jumlah provinsi di Indonesia saat ini?",
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling pendiam?",
        "Planet terbesar di tata surya?"
    };
    
    // Array dua dimensi yang berisi pilihan jawaban untuk setiap pertanyaan
    private String[][] options = {
        {"1. 15 Agustus 1945", "2. 16 Agustus 1945", "3. 14 Agustus 1945", "4. 17 Agustus 1945"},
        {"1. Kilimanjaro", "2. Everest", "3. Elbrus", "4. Aconcagua"},
        {"1. 85", "2. 90", "3. 75", "4. 80"},
        {"1. Soekarno", "2. Suharto", "3. Habibie", "4. Gus Dur"},
        {"1. Gudeg", "2. Lumpia", "3. Pempek", "4. Bakpia"},
        {"1. India", "2. Amerika Serikat", "3. China", "4. Indonesia"},
        {"1. 32", "2. 34", "3. 36", "4. 38"},
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Bali"},
        {"1. Harimau", "2. Semut", "3. Gajah", "4. Kucing"},
        {"1. Mars", "2. Bumi", "3. Jupiter", "4. Saturnus"}
    };
    
    // Array yang menyimpan indeks jawaban yang benar (1-based index)
    private int[] correctAnswers = {4, 2, 3, 1, 2, 3, 2, 1, 2, 3}; 
    private int score = 0; // Variabel untuk menyimpan skor pengguna

    // Method untuk mendapatkan jumlah pertanyaan dalam kuis
    public int getQuestionCount() {
        return questions.length;
    }

    // Method untuk menampilkan pertanyaan dan pilihan jawaban
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (String option : options[index]) {
            System.out.println(option);
        }
    }

    // Method untuk memeriksa jawaban yang dimasukkan oleh pengguna
    public void checkAnswer(int questionIndex, int userAnswer) {
        if (userAnswer == correctAnswers[questionIndex]) {
            System.out.println("Benar!");
            score += 10; // Menambah skor jika jawaban benar
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + options[questionIndex][correctAnswers[questionIndex] - 1]);
        }
    }

    // Method untuk mendapatkan skor akhir
    public int getScore() {
        return score;
    }

    // Method utama untuk menjalankan program kuis
    public static void main(String[] args) {
        Quiz quiz = new Quiz(); // Membuat objek dari kelas Quiz
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna

        // Loop untuk menampilkan semua pertanyaan dalam kuis
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i); // Menampilkan pertanyaan
            System.out.print("Masukkan jawaban Anda (1-4): ");
            int userAnswer = scanner.nextInt(); // Menerima input jawaban dari pengguna
            quiz.checkAnswer(i, userAnswer); // Mengecek jawaban yang dimasukkan
        }

        // Menampilkan skor akhir setelah kuis selesai
        System.out.println("\nSkor akhir Anda: " + quiz.getScore());
        scanner.close(); // Menutup objek Scanner untuk menghindari kebocoran sumber daya
    }
}