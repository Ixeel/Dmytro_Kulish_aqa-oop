public class Woman extends Person{
    static final String Gender = "жінка";
    public Woman(String Name, int age, PersonRole job) {
        super(Name, age, job);
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public PersonRole getJob() {
        return job;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setJob(PersonRole job) {
        this.job = job;
    }

    @Override
    public void displayInformation(){
        System.out.println("Ім'я: " + getName() + ", Вік: " + getAge() + ", Професія: " + getJob() + ", Стать: "+ Gender);
    }
}
