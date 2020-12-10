package autoboxing;

public class AutoBoxing3 {
    public static int method(Integer integer) {
        return integer;
    }

    public static void main(String[] args) {
        int s = method(100);
        Integer i = 1000;
        s = i.byteValue();
        System.out.println(s);
        GenericClass<Integer> genericClass =
                new GenericClass<Integer>(s);
    }
}

class GenericClass<T> {
    T field;

    GenericClass(T field) {
        this.field = field;
    }
}