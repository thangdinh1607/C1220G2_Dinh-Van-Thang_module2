package _13_search_algorithm.TH;

import java.util.Scanner;

public class ComplexLevel {
    static char complexLevel(String str) {
        int[] arrayASCII = new int[255];
        char character = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            arrayASCII[ascii] += 1;
        }
        for (int i = 0; i < 255; i++) {

            if (arrayASCII[i] > max) {
                max = arrayASCII[i];
            }
        }
        for (int i = 0; i < 255; i++) {
            if (arrayASCII[i] == max) {
                character = (char) i;
            }
        }
        return character;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string :");
        String string = input.nextLine();

        System.out.println(complexLevel(string));
    }
}

