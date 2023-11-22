package org.example.laba5;

//Наш интерфейс и его класс
public interface SomeOtherInterface {
    public void doSomeThing();
}
class SODoer implements SomeOtherInterface {
    public void doSomeThing(){ System.out.println("C");}
}