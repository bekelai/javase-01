public abstract class AbstractShape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractShape() {
    }

    public AbstractShape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public void printInfo() {
        System.out.println(name + ":" + getArea());
    }
}
