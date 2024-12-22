public class Man extends Person{
    static final String Gender = "чоловік";
    public Man(String Name, int age, PersonRole job) {
        super(Name, age, job);
    }
    @Override
    public void displayInformation() {
        System.out.println("Ім'я: " + getName() + ", Вік: " + getAge() + ", Професія: " + getJob() + ", Стать: " + Gender);
    }
}
