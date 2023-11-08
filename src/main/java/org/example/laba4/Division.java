package org.example.laba4;

public class Division {
    /**
     * Поле которое отвечает за имя
     */
    private String title;
    /**
     * Поле которое отвечает за ID  (генерируется внутри конструктора)
     */
    private int ID;
    /**
     *Констурктор Подразделения ,ID  - здесь просто значение Буквы по таблице ASCII
     * @param title- имя подразделения
     */
    public Division(String title) {
        this.title = title;
        ID= title.charAt(0);
    }
    /**
     *Метод преобразования Класса Division в строку
     */
    @Override
    public String toString() {
        return "Division{" +
                "title='" + title + '\'' +
                ", ID=" + ID +
                '}';
    }
    /**
     * Геттер для имени
     */
    public String getTitle() {
        return title;
    }
    /**
     *Сеттер имени
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     *Геттер айди
     */
    public int getID() {
        return ID;
    }
}
