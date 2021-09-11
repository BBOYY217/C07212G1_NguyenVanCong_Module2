package bai18_string_and_regex.exercise.validate_class_name;

public class ValidateCLassNameTest {
    private static ValidateClassName validateClassName;
    public static final String[] classes = new String[]{"C0318G","M0318G", "P0323A"};

    public static void main(String[] args) {

        validateClassName = new ValidateClassName();
        for (String account : classes) {
            boolean isvalid = validateClassName.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }

    }
}
