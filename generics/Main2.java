class DemoClass<T> { // type parameter
    private int number;

    public DemoClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public T method(T number) { // T as a placeholder
        System.out.println(number.getClass().getSimpleName());
        return number;
    }
}

class Main2 {
    public static void main(String[] args) {
        DemoClass<String> object = new DemoClass<String>(45);
        String value1 = object.method("true");
        DemoClass<Float> object2 = new DemoClass<Float>(12);
        float value2 = object2.method(45.2f);
    }
}