package org.example;
/**
 Мейн класс для проверки работоспособности нашего контейнера
 */
public class Main {
    public static void main(String[] args) {
        Container<String> test = new Container<>();
        test.add("y");
        test.add("e");
        test.add("s");
        System.out.println(test);
        Container<Integer> test2 = new Container<>();
        test2.add(1234);
        test2.add(1435);
        test2.add(1);
        test2.add(6576);
        System.out.println(test2);
    }
}