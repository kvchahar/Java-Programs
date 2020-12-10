package enumpractice;

import java.util.ArrayList;

@FunctionalInterface
interface Abc {
    void show();
}

class A {
    public void showMyDataFromLastYearDatabase() {
        System.out.println("in A");
    }
}

class B extends A {
    @Deprecated
    public void show() {
        System.out.println("In B");
    }

    @Override
    @SuppressWarnings("unchecked")

    public void showMyDataFromLastYearDatabase() {
        ArrayList obj = new ArrayList();
        System.out.println("In B");
    }
}


public class AnnotationDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showMyDataFromLastYearDatabase();
    }
}
