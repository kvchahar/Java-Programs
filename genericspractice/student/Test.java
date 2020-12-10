package genericspractice.student;

class Student<T> {
    private T name;

    Student(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "name of student: " + name);
    }
}

class Name<F, L> {
    private F firstName;
    private L lastName;

    Name(F firstName,L lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public F getFirstName() {
        return firstName;
    }

    public void setFirstName(F firstName) {
        this.firstName = firstName;
    }

    public L getLastName() {
        return lastName;
    }

    public void setLastName(L lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("firstName: " + firstName +
                ", lastName: " + lastName);
    }
}

public class Test {
    public static void main(String[] args) {
        Student<String> studentName = new Student<>("Krishnaveer");
        Name<String, String> studName = new Name<>("Krishnaveer","Chahar");
        System.out.println(studentName);
        System.out.println(studName);
    }
}
