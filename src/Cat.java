public class Cat extends Animal {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃鱼。");
    }

    public void catchMouse() {
        System.out.println(getName() + "在抓老鼠。");
    }
}
