package Controllers;

import Models.Services;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegex {
    private Pattern pattern;
    private Matcher matcher;
    public static final String REGEX_ID = "^SV+(VL|HO|RO)+[0-9]{4}$";

    boolean checkRegexVilla(Services services){
        return Pattern.compile(REGEX_ID).matcher(services.getId()).matches();
    }
}
