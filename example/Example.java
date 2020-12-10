package example;

public class Example {
    public static void main(String[] args) {
        Student student = new Student(null,19);
        try{
            System.out.println(student.getName().charAt(0));
        }
        catch(NullPointerException nullPointerException){
            System.err.println("Name is not initialized ");
        }
    }
}

class Student {

    private String name;
    private int rollNumber;

    public Student(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

}
