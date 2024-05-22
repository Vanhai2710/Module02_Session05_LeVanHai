package ra.Session05_Homeworks;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Bán kính của hình tròn 1: " + circle1.getRadius());
        System.out.println("Diện tích của hình tròn 1: " + circle1.getArea());

        Circle circle2 = new Circle(3.5);
        System.out.println("Bán kính của hình tròn 2: " + circle2.getRadius());
        System.out.println("Diện tích của hình tròn 2: " + circle2.getArea());
    }
}
