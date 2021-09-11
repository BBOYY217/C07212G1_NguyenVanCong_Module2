package bai18_string_and_regex.exercise.validate_phone_number;

public class ValidatePhoneNumberTest {
    public static ValidatePhoneNumber validatePhoneNumber;
    public  static final String[] number = new String []{"84-0978489648","a2-22222222"};

    public static void main(String[] args) {
        validatePhoneNumber =new ValidatePhoneNumber();
        for (String account : number) {
            boolean isvalid = validatePhoneNumber.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
