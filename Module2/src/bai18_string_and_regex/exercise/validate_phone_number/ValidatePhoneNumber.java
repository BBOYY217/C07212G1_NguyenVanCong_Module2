package bai18_string_and_regex.exercise.validate_phone_number;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String NUMBER_REGEX = "^[0-9]{2}-[0-9]{10}$";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex) {
        return Pattern.matches(NUMBER_REGEX, regex);

    }
}
