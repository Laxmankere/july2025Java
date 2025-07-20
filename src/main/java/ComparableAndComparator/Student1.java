package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student1 implements Comparable<Student1> {
    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[age=" + age + ", name=" + name + "]";
    }

    // Comparable logic (sorting by age)
    @Override
    public int compareTo(Student1 that) {
        // Ascending order by age
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        // Create a list of students
        List<Student1> students = new ArrayList<>();
        students.add(new Student1(25, "Naveen"));
        students.add(new Student1(20, "Ajay"));
        students.add(new Student1(22, "Zara"));
        students.add(new Student1(21, "Pooja"));

        System.out.println("Before Sorting:");
        for (Student1 s : students) {
            System.out.println(s);
        }

        // Sort using Comparable
        Collections.sort(students);

        System.out.println("\nAfter Sorting by Age:");
        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}