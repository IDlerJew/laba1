package org.example.laba4;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.io.File.separator;

public class Test {

    public static void  main(String[] args) throws CsvValidationException, IOException {
        //Лист в который мы поместим все строки из файла
        List<Human> list=new ArrayList<>();


        try {
            //Путь к файлу
            String file="D:/временный рабочий 2/папка 7.30/foreign_names/foreign_names.csv";
            // Создаем объект который будет читать csv файл
            FileReader filereader = new FileReader(file);
            //Делаю сепаратор со знаком + чтобы НЕ делить одну строку на несколько строк в массиве строк (а то с
            //запятой в виде разделителя  а то в nextRecord[] было несколько строк это неудобно(на айди 28718 имя через,)
            CSVParser parser = new CSVParserBuilder().withSeparator('+').build();
            CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();
            String[] nextRecord;
            nextRecord = csvReader.readNext();

            // Цикл где будем перебирать все строки таблицы
            while ((nextRecord = csvReader.readNext()) != null) {
                // Цикл можно заменить на Human human=StringEx(nextRecord[0]) но я решил пока оставить может всё-таки
                // надо было пользоваться нормальным сепаратором
                for (String cell : nextRecord) {
                    Human human=StringEx(cell);
                    list.add(human);
                    }

                }
            System.out.println(list);

            }

        catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * Функция которая раскладывает строку на данные для класса Human
     * @param info- строка которую берём из таблицы
     * @return human объект класса Human c уже заполненными параметрами
     */
    public static Human StringEx(String info){
        int ID;
        String name;
        String sex;
        String birthday;
        int salary;
        String div;
        ID= Integer.parseInt(info.substring(0,5));
       // System.out.println(ID);
        int beginIndex=6;
        int endIndex=6;
        for(;info.charAt(endIndex)!=';';endIndex++){
        }
        name= info.substring(beginIndex,endIndex);
        endIndex++;
        beginIndex=endIndex;
        for(;info.charAt(endIndex)!=';';endIndex++){
        }
        sex= info.substring(beginIndex,endIndex);
        endIndex++;
        beginIndex=endIndex;
        for(;info.charAt(endIndex)!=';';endIndex++){
        }
        birthday= info.substring(beginIndex,endIndex);
        beginIndex=endIndex+1;
        endIndex+=2;

        div=info.substring(beginIndex,endIndex);
        endIndex++;
        beginIndex=endIndex;

        for(;info.length()>endIndex;endIndex++){
        }
        salary= Integer.parseInt(info.substring(beginIndex,endIndex));
        return new Human(ID,name,sex,salary,birthday,div);
    }

}

