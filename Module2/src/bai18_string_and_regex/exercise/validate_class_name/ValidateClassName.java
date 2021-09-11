package bai18_string_and_regex.exercise.validate_class_name;

import java.util.regex.Pattern;

public class ValidateClassName {
    private  static  ValidateClassName validateClassName;
    public  static final String CLASS_REGEX ="^[CAP]+[0-9]{4}+[GHIKLM]$";

    public ValidateClassName(){
    }

    public boolean validate(String regex) {
        return Pattern.matches(CLASS_REGEX,regex);
    }

}
