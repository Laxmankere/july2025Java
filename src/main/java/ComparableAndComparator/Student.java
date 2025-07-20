package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
//        return "Student age=" + age + ", name=" + name;  -> we can write this way also
        return "Student[age=" + age + ", name=" + name + "]";
    }

    public static void main(String[] args) {

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(25, "Naveen"));
        students.add(new Student(20, "Ajay"));
        students.add(new Student(22, "Zara"));
        students.add(new Student(21, "Pooja"));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
        // Sort by age using Comparator
        Comparator<Student> sortByAge = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(students, sortByAge);

        System.out.println("\nAfter Sorting by Age:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
