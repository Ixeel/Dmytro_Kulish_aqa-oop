public class Woman extends Person{
    static final String Gender = "жінка";
    public Woman(String Name, int age, PersonRole job) {
        super(Name, age, job);
    }

    @Override
    public void displayInformation(){
        System.out.println("Ім'я: " + getName() + ", Вік: " + getAge() + ", Професія: " + getJob() + ", Стать: "+ Gender);
    }
}
