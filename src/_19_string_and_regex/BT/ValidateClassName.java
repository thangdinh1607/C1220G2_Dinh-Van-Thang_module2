package _19_string_and_regex.BT;

import _19_string_and_regex.TH.ValidateAccount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private Pattern pattern;
    private Matcher matcher;
    public static final String REGEX_CLASSNAME = "^[ACP]+[0-9]{4}+[GHIKLM]";

    boolean checkClassName(String str) {
        pattern = Pattern.compile(REGEX_CLASSNAME);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateClassName validateClassName = new ValidateClassName();

        System.out.println("Enter Class Name :");
        String classname = scanner.nextLine();
        System.out.println("Class Name : " + classname + " is " + validateClassName.checkClassName(classname));
    }
}
