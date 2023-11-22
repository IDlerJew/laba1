package org.example.laba5;

//Тот самый бин с аннотациями и без конструкторов и геттеров сеттеров
class SomeBean{

    @AutoInjectable
    private SomeInterface field1;
    @AutoInjectable
    private SomeOtherInterface field2;

    public void foo(){
        field1.doSomething();
        field2.doSomeThing();
    }
}
