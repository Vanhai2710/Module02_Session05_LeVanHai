package ra.Session05_Homeworks;

import java.util.Scanner;

public class Ex_01 {
    private double radius;
    private String color;

    // Constructor không tham số
    public Ex_01() {
        this.radius = 0.0;
        this.color = "";
    }

    // Constructor có tham số
    public Ex_01(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter cho bán kính
    public double getRadius() {
        return radius;
    }

    // Setter cho bán kính
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter cho màu sắc
    public String getColor() {
        return color;
    }

    // Setter cho màu sắc
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính chu vi
    public double chuvi() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double dientich() {
        return Math.PI * radius * radius;
    }

    // Phương thức nhập dữ liệu
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // clear the newline character left by nextDouble()
        System.out.print("Nhập màu sắc: ");
        color = scanner.nextLine();
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi: " + chuvi());
        System.out.println("Diện tích: " + dientich());
    }

    // Phương thức main để kiểm thử lớp Circle
    public static void main(String[] args) {
        Ex_01 circle = new Ex_01();

        // Nhập dữ liệu cho đối tượng
        circle.inputData();

        // Hiển thị dữ liệu của đối tượng
        circle.displayData();
    }
}