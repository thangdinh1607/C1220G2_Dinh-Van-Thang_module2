package _13_search_algorithm.BT;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConsecutiveString {
    static List<Character> consecutiveString(String str) {
         List<Character> characterList = new LinkedList<>();
        List<Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            if (characterList.size() < 1) {
                characterList.add(str.charAt(i));
            }
            if ((int) str.charAt(i) < (int) str.charAt(i + 1)) {
                characterList.add(str.charAt(i));
            }
            if (characterList.size() > max.size()) {
                max.clear();
                max.addAll(characterList);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> list = new LinkedList<>();

        System.out.println("Enter a String :");
        String str = scanner.nextLine();

        System.out.println(consecutiveString(str).toString());

    }
}

