import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> countWords = new HashMap<>();
        System.out.print("Lütfen bir metin giriniz: ");
        String inputText = input.nextLine();
        String[] wordList = inputText.split(" ");


        for (String str : wordList) {
            if (countWords.containsKey(str)) {
                countWords.put(str, countWords.get(str) + 1);
            } else {
                countWords.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> k : countWords.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
    }
}