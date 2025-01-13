public abstract class Person implements Displayable {
    protected String Name;
    protected int age;
    protected PersonRole job;

    public Person(String Name, int age, PersonRole job){
        try {
            AgeValidator.validate(age);
            this.Name = Name;
            this.age = age;
            this.job = job;
        } catch (InvalidAgeException e) {
            System.out.println("Виняток: " + e);
        }
    }

    public abstract String getName();

    public abstract int getAge();

    public abstract PersonRole getJob();

    public abstract void setName(String Name);

    public abstract void setAge(int age);

    public abstract void setJob(PersonRole job);

    @Override
    public abstract void displayInformation();
}
