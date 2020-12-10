package generics;

class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

class Table implements Comparable<Table> {
    @Override
    public int compareTo(Table o) {
        return 0;
    }
}
