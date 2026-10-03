public class Dog extends Animal {
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在啃骨头。");
    }

    public void watchDoor() {
        System.out.println(getName() + "在看门。");
    }
}
