package ra.Session05_Homeworks;

public class Ex_07 {
    public static void main(String[] args) {
        // Kiểm tra lớp Student
        Student student1 = new Student(1, "Nguyen Van A", true, "Java", 20, "Ha Noi");
        System.out.println("Student 1:");
        System.out.println("ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getStudentName());
        System.out.println("Sex: " + student1.isSex());
        System.out.println("Class: " + student1.getClassName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Address: " + student1.getAddress());

        Student student2 = new Student();
        student2.setStudentId(2);
        student2.setStudentName("Tran Thi B");
        student2.setSex(false);
        student2.setClassName(".NET");
        student2.setAge(22);
        student2.setAddress("TP HCM");

        System.out.println("\nStudent 2:");
        System.out.println("ID: " + student2.getStudentId());
        System.out.println("Name: " + student2.getStudentName());
        System.out.println("Sex: " + student2.isSex());
        System.out.println("Class: " + student2.getClassName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Address: " + student2.getAddress());
    }

    static class Student {
        private int studentId;
        private String studentName;
        private boolean sex;
        private String className;
        private int age;
        private String address;

        // Phương thức khởi tạo không tham số
        public Student() {
        }

        // Phương thức khởi tạo có đầy đủ tham số
        public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.sex = sex;
            this.className = className;
            this.age = age;
            this.address = address;
        }

        // Phương thức getter và setter
        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
