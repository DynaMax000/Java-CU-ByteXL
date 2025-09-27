import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;
    String grade;

    Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class Q2 {
    public static void main(String[] args) {
        String filename = "studentData.ser";
        Student student = new Student(13553, "Lavesh Kartik", "A+");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Student object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("\nDeserialized Student Object:");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
