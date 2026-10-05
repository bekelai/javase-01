public class ShapeTest2 {
    public static void main(String[] args) {
        AbstractShape s = new Circle2(3);
        s.printInfo();
        AbstractShape s1 = new Rectangle2(3, 4);
        s1.printInfo();
    }
}
