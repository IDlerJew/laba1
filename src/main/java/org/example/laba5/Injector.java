package org.example.laba5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Injector {
    public static void main(String[] args) throws IOException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        SomeBean someBean = new SomeBean();//Делаем бин
        inject(someBean);// запускаем функцию
        someBean.foo();// Проверяем

    }
    public static <T> void inject(T object) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //настраиваем путь к файлу откуда будем брать имена
        File file = new File("D:/crusader/sddfg/laba1/src/main/resources/properties");
        Properties properties = new Properties();
        properties.load(new FileReader(file));
        // Берём класс объекта
        Class<?> objectClass = object.getClass();
        //Берём все поля этого объекта
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) {
            //Проверяем если у поля есть аннотация AutoInjectable
            if (field.getAnnotation(AutoInjectable.class)!= null) {
                //берём тип поля
                String nameField = field.getType().getName();
                // ищем в файле по имени типа поля строчку с именем того класса который надо будет создать
                String nameOurClass= properties.getProperty(nameField);
                //Создаем (не совсем создаём ) наш класс по имени
                Class<?> implementationClass = Class.forName(nameOurClass);
                // Создаём объект класса implementationClass
                Object implementationObject = implementationClass.getDeclaredConstructor().newInstance();
                //даём доступ на изменение
                field.setAccessible(true);

                field.set(object,implementationObject);
                //Сразу после изменения закрываем доступ
                field.setAccessible(false);

            }
        }

    }
}
