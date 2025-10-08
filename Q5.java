import java.util.*;
class Student 
{
    private String name;
    private double marks;
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() { return name; }
    public double getMarks() { return marks; }
}

public class Q5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Lavesh Kartik", 82.5),
            new Student("Samar Sood", 67.0),
            new Student("Harshit", 91.0),
            new Student("Manish Sharma", 74.0),
            new Student("Piyush Verma", 88.5)
        );
        students.stream()
                .filter(s -> s.getMarks() > 75)
                .sorted(Comparator.comparingDouble(Student::getMarks))
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
