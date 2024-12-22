public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("John", 30, PersonRole.ENGINEER);
        man1.displayInformation();
        Woman woman1 = new Woman("Mary", 25, PersonRole.TEACHER);
        woman1.displayInformation();
        Man man2 = new Man("Bob", 35, PersonRole.DOCTOR);
        man2.displayInformation();
        Woman woman2 = new Woman("Alice", 28, PersonRole.ARCHITECTOR);
        woman2.displayInformation();
        woman2.setJob(PersonRole.QA_ENGINEER);
        woman2.displayInformation();
    }
}