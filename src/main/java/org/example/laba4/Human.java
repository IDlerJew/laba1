package org.example.laba4;

import javax.xml.namespace.QName;

public class Human {
    /**
    Поле ID типа int
     */
    private int ID;
    /**
     * Поле name типа String
     */
    private String name;
    /**
     * Поле sex типа String
     */
    private String sex;
    /**
     * Поле salary типа int
     */
    private int salary;
    /**
     * Поле dateBirth типа string
     */
    private String dateBirth;
    /**
     * Поле div типа Division
     */
    private Division div;


    /**
     * Конструктор со всеми параметрами
     * @param ID -параметр айди
     * @param name - параметр имени
     * @param sex -параметр пола
     * @param salary -параметр зарплаты
     * @param dateBirth -параметр даты рождения
     * @param divString -параметр который отвечает за подразделение
     */
    public Human(int ID,String name, String sex, int salary, String dateBirth,String divString) {
        this.ID=ID;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.dateBirth = dateBirth;
        div=new Division(divString);
    }
/**
 * Преобразовывает класс Human в строку
 * @return String - та самая строка
 */
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                ", dateBirth='" + dateBirth + '\'' +
                ", ID="+ID+'\''+
                ", Division="+div+'\''+
                '}'+"\n";
    }

    /**
     *Геттер ID
     * @return ID
     */
    public int getID() {
        return ID;
    }
    /**
     * Сеттер ID
     * @param ID -
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Геттер name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Сеттер name
     * @param name -
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *Геттер пола
     * @return sex
     */
    public String getSex() {
        return sex;
    }
    /**
     *Сеттер пола
     * @param sex -
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * Геттер зарплаты
     * @return salary
     */
    public int getSalary() {
        return salary;
    }
    /**
     *Сеттер зарплаты
     * @param salary -
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /**
     *Геттер даты рождения
     * @return dateBirth
     */
    public String getDateBirth() {
        return dateBirth;
    }
    /**
     *Сеттер даты рождения
     * @param dateBirth -
     */
    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
}
