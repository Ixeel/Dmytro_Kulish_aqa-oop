public class Validator {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("age is not valid" );
        }
    }
    public static void validateName(String Name) throws InvalidNameException {
        if (Name.isEmpty()) {
            throw new InvalidNameException("Name is empty" );
        }
    }
}
