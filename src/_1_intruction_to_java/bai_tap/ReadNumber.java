package _1_intruction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;
        String result = "";
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Number :");
        number = scanner.nextInt();

        if (number < 1000 && number > 100) {
            switch (number / 100) {
                case 1:
                    result += "one hundred ";
                    break;
                case 2:
                    result += "two hundred ";
                    break;
                case 3:
                    result += "three hundred ";
                    break;
                case 4:
                    result += "four hundred ";
                    break;
                case 5:
                    result += "five hundred ";
                    break;
                case 6:
                    result += "six hundred ";
                    break;
                case 7:
                    result += "seven hundred ";
                    break;
                case 8:
                    result += "eight hundred ";
                    break;
                case 9:
                    result += "nine hundred ";
                    break;
                default:
                    result += "";
            }
            switch (number % 100 / 10) {
                case 0:
                    result += "";
                    break;
                case 1:
                    switch (number % 100 % 10) {
                        case 1:
                            result += " eleven";
                            break;
                        case 2:
                            result += " twelve";
                            break;
                        case 3:
                            result += " thirteen";
                            break;
                        case 4:
                            result += " fourteen";
                            break;
                        case 5:
                            result += " fiveteen";
                            break;
                        case 6:
                            result += " sixteen";
                            break;
                        case 7:
                            result += " seventeen";
                            break;
                        case 8:
                            result += " eightteen";
                            break;
                        case 9:
                            result += " nineteen";
                            break;
                    }
                    break;
                case 2:
                    result += " twenty ";
                    break;
                case 3:
                    result += " thirty";
                    break;
                case 4:
                    result += " forty";
                    break;
                case 5:
                    result += " fifty";
                    break;
                case 6:
                    result += " sixty";
                    break;
                case 7:
                    result += " seventy";
                    break;
                case 8:
                    result += " eighty";
                    break;
                case 9:
                    result += " ninety";
                    break;
            }
            switch (number % 100 % 10) {
                case 1:
                    result += " one ";
                    break;
                case 2:
                    result += " two ";
                    break;
                case 3:
                    result += " three ";
                    break;
                case 4:
                    result += " four ";
                    break;
                case 5:
                    result += " five ";
                    break;
                case 6:
                    result += " six ";
                    break;
                case 7:
                    result += " seven ";
                    break;
                case 8:
                    result += " eight ";
                    break;
                case 9:
                    result += " nine ";
                    break;
            }

        } else if (number <= 100 & number > 20) {
            switch (number % 10) {
                case 0:
                    result += "";
                    break;
                case 1:
                    switch (number % 10) {
                        case 1:
                            result += " eleven";
                            break;
                        case 2:
                            result += " twelve";
                            break;
                        case 3:
                            result += " thirteen";
                            break;
                        case 4:
                            result += " fourteen";
                            break;
                        case 5:
                            result += " fiveteen";
                            break;
                        case 6:
                            result += " sixteen";
                            break;
                        case 7:
                            result += " seventeen";
                            break;
                        case 8:
                            result += " eightteen";
                            break;
                        case 9:
                            result += " nineteen";
                            break;
                    }
                    break;
                case 2:
                    result += " twenty ";
                    break;
                case 3:
                    result += " thirty";
                    break;
                case 4:
                    result += " forty";
                    break;
                case 5:
                    result += " fifty";
                    break;
                case 6:
                    result += " sixty";
                    break;
                case 7:
                    result += " seventy";
                    break;
                case 8:
                    result += " eighty";
                    break;
                case 9:
                    result += " ninety";
                    break;
            }
            switch (number % 10 % 10) {
                case 1:
                    result += " one ";
                    break;
                case 2:
                    result += " two ";
                    break;
                case 3:
                    result += " three ";
                    break;
                case 4:
                    result += " four ";
                    break;
                case 5:
                    result += " five ";
                    break;
                case 6:
                    result += " six ";
                    break;
                case 7:
                    result += " seven ";
                    break;
                case 8:
                    result += " eight ";
                    break;
                case 9:
                    result += " nine ";
                    break;
            }
        } else {
            switch (number % 10) {
                case 1:
                    result += " eleven";
                    break;
                case 2:
                    result += " twelve";
                    break;
                case 3:
                    result += " thirteen";
                    break;
                case 4:
                    result += " fourteen";
                    break;
                case 5:
                    result += " fiveteen";
                    break;
                case 6:
                    result += " sixteen";
                    break;
                case 7:
                    result += " seventeen";
                    break;
                case 8:
                    result += " eighteen";
                    break;
                case 9:
                    result += " nineteen";
                    break;
            }
        }
        System.out.println(number + " : " + result);
    }

}

