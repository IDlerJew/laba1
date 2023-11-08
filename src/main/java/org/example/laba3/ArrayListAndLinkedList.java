package org.example.laba3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void  main(String[] args){
            int iterations =10000;
            long timeAddArrayList;
            long timeGetArrayList;
            long timeRemoveArrayList;
            long timeAddLinkedList;
            long timeGetLinkedist;
            long timeRemoveLinkedList;


            ArrayList<Integer> arrayList= new ArrayList<>();
            for (int i = 0; i < iterations ; i++) {
            arrayList.add(i);
            }
            LinkedList<Integer> linkedList= new LinkedList<>();
            for (int i = 0; i < iterations ; i++) {
            linkedList.add(i);
            }

            long startTime = System.nanoTime();
            for (int i = 0; i < iterations ; i++) {
                arrayList.add(i);
            }
            long endTime = System.nanoTime();
            timeAddArrayList= (endTime - startTime) / 100000;


            startTime = System.nanoTime();
            for (int i = 0; i < iterations ; i++) {
                arrayList.get(i);
            }
            endTime = System.nanoTime();
            timeGetArrayList= (endTime - startTime) / 100000;

            startTime = System.nanoTime();
            for (int i = 0; i < iterations-1 ; i++) {
            arrayList.remove(i);
            }
            endTime = System.nanoTime();
            timeRemoveArrayList=(endTime - startTime) / 100000;

            System.out.println();

            startTime = System.nanoTime();
            for (int i = 0; i < iterations ; i++) {
                linkedList.add(i);
            }

            endTime = System.nanoTime();
            timeAddLinkedList= (endTime - startTime) / 100000;


            startTime = System.nanoTime();
            for (int i = 0; i < iterations ; i++) {
                linkedList.get(i);
            }
            endTime = System.nanoTime();
            timeGetLinkedist= (endTime - startTime) / 100000;

            startTime = System.nanoTime();
            for (int i = 0; i < iterations ; i++) {
                linkedList.remove(i);
            }
            endTime = System.nanoTime();

            timeRemoveLinkedList=(endTime - startTime) / 100000;



        System.out.println("Метод\t\t\tКоличество повторений\t\tВремя выполнения (наносек)");
        System.out.println("----------------------------------------------------------------");
        System.out.println("ArrayList.add\t\t" + iterations + "\t\t\t\t" + timeAddArrayList);
        System.out.println("LinkedList.add\t\t" + iterations + "\t\t\t\t" + timeAddLinkedList);
        System.out.println("ArrayList.remove\t" + iterations + "\t\t\t\t" + timeRemoveArrayList);
        System.out.println("LinkedList.remove\t" + iterations + "\t\t\t\t" + timeRemoveLinkedList);
        System.out.println("ArrayList.get\t\t" + iterations + "\t\t\t\t" + timeGetArrayList);
        System.out.println("LinkedList.get\t\t" + iterations + "\t\t\t\t" + timeGetLinkedist);


        /*long startTime = System.nanoTime();

        for (int i=0;i<10000;i++){
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        long timeAddLinkedList= (endTime-startTime)/100000;
        //System.out.println(timeAddLinkedList);
*/

    }
}
