package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Класс для unit-тестов. не уверен что для unit тестов необходимо писать java-doc  , написал кратко.
 */
public class ContainerTest {
    /**
     * Тест для проверки метод гет по индексу
     */
    @Test
    void getTest(){
        Container<Integer> test= new Container<>();
        test.add(5);
        test.add(6);
        test.add(7);
        int value= test.get(1);
        Assertions.assertEquals(6,value);
    }
    /**
     * Тест для проверки удаления элемента по индексу
     */
    @Test
    void deleteIndexTest(){
        Container<Integer> test= new Container<>();
        test.add(5);
        test.add(6);
        test.add(7);
        test.removeIndex(1);
        int valueFirst=test.get(0);
        int valueSecond=test.get(1);
        Assertions.assertEquals(5,valueFirst);
        Assertions.assertEquals(7,valueSecond);
    }
    /**
     * Тест для проверки удаления элемента по значению
     */
    @Test
    void deleteValueTest(){
        Container<Integer> test= new Container<>();
        test.add(5);
        test.add(6);
        test.add(7);
        test.removeValue(5);
        int valueFirst=test.get(0);
        int valueSecond=test.get(1);
        Assertions.assertEquals(6,valueFirst);
        Assertions.assertEquals(7,valueSecond);
    }
    /**
     * Тест для проверки метожа возвращающего размер контерйнера
     */
    @Test
    void sizeMethodTest(){
        Container<Integer> test= new Container<>();
        test.add(15);
        test.add(26);
        test.add(37);
        test.add(6764);
        int sizeTest=test.size();
        Assertions.assertEquals(4,sizeTest);
    }
}
