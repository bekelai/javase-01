public class ShapeTest {
    public static void main(String[] args) {
        Shape[] arr = {new Circle(3), new Rectangle(4, 5), new Triangle(6, 4)};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.format("%.2f",arr[i].getArea()));
            sum = sum + arr[i].getArea();
        }
        System.out.println(String.format("%.2f",sum));
    }
}
