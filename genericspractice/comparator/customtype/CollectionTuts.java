package genericspractice.comparator.customtype;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTuts {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1, 23));
        studs.add(new Student(2, 98));
        studs.add(new Student(3, 44));
        studs.add(new Student(4, 63));
        studs.add(new Student(5, 33));

        Collections.sort(studs,(s1,s2)->{
            return s1.marks>s2.marks?-1:1;
        });

        for (Student st : studs) {
            System.out.println(st);
        }
    }
}

class Student {
    int rollNumber;
    int marks;

    public Student(int rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }
}
