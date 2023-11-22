package org.example.laba5;

//Наш интерфейс и его классы
public interface SomeInterface {
    public void doSomething();

}
class SomeImpl implements SomeInterface {
    public void doSomething(){ System.out.println("A");}
}
class OtherImpl implements SomeInterface {
    public void doSomething(){ System.out.println("B");}
}
