package generics;

class Student1<T extends Number> {

    private T rollNumber;

    public Student1(T rollNumber) {
        this.rollNumber = rollNumber;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(T rollNumber) {
        this.rollNumber = rollNumber;
    }

    private static <R extends String> R method() {
        return null;
    }

    private static <S extends Integer> void method(S parameter) {

    }
}

class Main {
    public static void main(String[] args) {
        Student1<Integer> student = new Student1<>(45);

        // generics works with all reference class
        // ( Wrapper class, pre-defined class )

    }
}

