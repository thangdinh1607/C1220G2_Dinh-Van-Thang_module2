package _19_string_and_regex.BT;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private Pattern pattern;
    private Matcher matcher;
    public static final String REGEX_PHONE_NUMBER = "^[0-9]{2}-0+[0-9]{9}";

    boolean checkPhoneNumber(String str) {
        pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumber = {"84-0978489648", "a8-22222222"};
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

        for (String a : phoneNumber) {
            System.out.println("Phone number : " + a + "  is  " + validatePhoneNumber.checkPhoneNumber(a));
        }
    }
}
