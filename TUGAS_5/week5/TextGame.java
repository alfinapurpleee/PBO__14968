package week5;

import java.util.ArrayList;

public class TextGame {
    protected ArrayList<Character> characters = new ArrayList<>();

    public void inputText(String text) {
        characters.clear();
        for (char c : text.toCharArray()) {
            characters.add(Character.toUpperCase(c));  // Mengubah huruf menjadi kapital
        }
    }

    // Overload 1 - String
    public boolean isPalindrome(String text) {
        inputText(text);
        return isPalindrome();
    }

    // Overload 2 - ArrayList
    public boolean isPalindrome(ArrayList<Character> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }
        return true;
    }

    // Default behavior
    public boolean isPalindrome() {
        return isPalindrome(this.characters);
    }

    public void displayResult(String word) {
        // Menampilkan hasil apakah kata palindrome atau bukan
        System.out.println("Hasil: " + (isPalindrome(word) ? "Palindrome" : "Bukan Palindrome"));
    }
}
