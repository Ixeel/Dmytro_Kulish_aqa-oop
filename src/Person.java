public class Person implements Displayable{
    private String Name;
    private int age;

    private PersonRole job;


    public Person(String Name, int age, PersonRole job) {
        this.Name = Name;
        this.age = age;
        this.job = job;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }
    public PersonRole getJob() {
        return job;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setJob(PersonRole job){
        this.job = job;
    }

    @Override
    public void displayInformation() {
        System.out.println("Ім'я: " + Name + ", Вік: " + age + ", Професія: " + job);
    }
}
