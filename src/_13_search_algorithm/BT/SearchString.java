package _13_search_algorithm.BT;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SearchString {
    static List<Character> searchString(String str) {
        List<Character> characterList = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            if (characterList.size() < 1) {
                characterList.add(str.charAt(i));
            } else if ((int) str.charAt(i - 1) < (int) str.charAt(i)) {
                characterList.add(str.charAt(i));
            }
        }
        return characterList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String string = input.nextLine();

        System.out.println(searchString(string).toString());
    }
}


