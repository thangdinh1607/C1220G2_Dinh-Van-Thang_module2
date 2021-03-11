package _19_string_and_regex.TH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private Pattern pattern;
    private Matcher matcher;
    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    boolean checkValidateAccount(String str) {
        return Pattern.compile(ACCOUNT_REGEX).matcher(str).matches();
    }

    public static void main(String[] args) {
        String[] account = {"asdasd_âxdđ..", "asdasdcc", "1231aa_ê"};
        ValidateAccount validateAccount = new ValidateAccount();

        for (int i = 0; i < account.length; i++) {
            validateAccount.checkValidateAccount(account[i]);
            System.out.println("Account :" + account[i] + "is  " + validateAccount.checkValidateAccount(account[i]));
        }
    }
}
