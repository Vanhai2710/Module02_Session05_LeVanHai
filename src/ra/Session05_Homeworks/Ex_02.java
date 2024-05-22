package ra.Session05_Homeworks;

import java.util.Scanner;

public class Ex_02 {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    // Constructor không tham số
    public Ex_02() {
        this.employeeId = "";
        this.employeeName = "";
        this.age = 0;
        this.gen = "";
        this.rate = 0.0;
        this.salary = 0.0;
    }

    // Constructor có tham số
    public Ex_02(String employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = 0.0;
    }

    // Getter và Setter cho các thuộc tính
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    // Phương thức nhập dữ liệu
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        employeeId = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character
        System.out.print("Nhập giới tính: ");
        gen = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        rate = scanner.nextDouble();
    }

    // Phương thức tính lương
    public void calSalary() {
        salary = rate * 1300000;
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gen);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
    }

    // Phương thức main để kiểm thử lớp Employee
    public static void main(String[] args) {
        Ex_02 employee = new Ex_02();

        // Nhập dữ liệu cho đối tượng
        employee.inputData();

        // Tính lương
        employee.calSalary();

        // Hiển thị dữ liệu của đối tượng
        employee.displayData();
    }
}
