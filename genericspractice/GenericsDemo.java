package genericspractice;

import java.util.ArrayList;

class Container<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public void show(){
        System.out.println(value.getClass().getName());
    }

    public Container(T value) {
        this.value = value;
    }
    public void demo(ArrayList<? extends T> obj){
        System.out.println(getValue());
    }
}
public class GenericsDemo{
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>(5);
        obj.show();
        obj.demo(new ArrayList<Integer>(5));
    }
}
