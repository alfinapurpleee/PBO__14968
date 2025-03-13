package week3;
 
import java.util.Random;
import java.util.Scanner;

public class QuisAngka{  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("================");
        System.out.println("TEBAK ANGKA");
        System.out.println("================");

        int angkaBenar = r.nextInt(10) + 1; // Angka acak antara 1-10
        int tebakan;

        do {
            System.out.print("Masukkan tebakanmu (1-10): ");
            tebakan = s.nextInt();

            if (tebakan < angkaBenar) {
                System.out.println("Angka terlalu kecil, coba lagi!");
            } else if (tebakan > angkaBenar) {
                System.out.println("Angka terlalu besar, coba lagi!");
            } else {
                System.out.println("Tebakan kamu benar!");
            }
        } while (tebakan != angkaBenar); // Loop hingga tebakan benar

    }
}

