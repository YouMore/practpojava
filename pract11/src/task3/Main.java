package task3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(5, 12, 2003, 10, 11, 3, "Aidar", "IKBO-20-21", "MIREA", "09.03.04");
        System.out.println(student);
        student.setDateFormat("dd.MM.YYYY hh:mm:ss");
        System.out.println(student);
    }
}