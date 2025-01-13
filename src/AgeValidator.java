public class AgeValidator {

    public static void validate(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("age is not valid" );
        }
    }
}
