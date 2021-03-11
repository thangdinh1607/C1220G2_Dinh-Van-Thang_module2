package _19_string_and_regex.TH;

import javafx.scene.shape.PathElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

//    void validateEmail() {
//        pattern = Pattern.compile(EMAIL_REGEX);
//    }

    boolean checkEmail(String str) {
        return Pattern.compile(EMAIL_REGEX).matcher(str).matches();
    }

    public static void main(String[] args) {
        ValidateEmail validateEmail = new ValidateEmail();

        String[] validate = {"a@gmail.com", "ab@yahoocom", "abc@hotmail.com"};
        for (int i = 0; i < validate.length; i++) {
            System.out.println(validate[i]+ "is " +validateEmail.checkEmail(validate[i]) );
        }
    }
}

