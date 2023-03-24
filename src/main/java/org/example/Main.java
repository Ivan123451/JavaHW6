package org.example;

//1 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//Реализовать в java.
//2 Создать множество ноутбуков (ArrayList).
//3 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//Выводить только те ноутбуки, что соответствуют условию

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Laptop Dell = new Laptop("Dell", 4, "red", 4, 14);
        Laptop Honor = new Laptop("Honor", 8, "black", 8, 15);
        Laptop MacBook = new Laptop("MacBook", 8, "white", 8, 13);

        Honor.setMemory(16); // добавил памяти


        List <Laptop> myList = new ArrayList();

        myList.add(Dell);
        myList.add(Honor);
        myList.add(MacBook);


        System.out.println("Ноутбук с каким количестовом оперативной памяти Вам необходим? ");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();

        System.out.println("Вам подойдет: ");
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).memory >= number) {
                System.out.println(myList.get(i));
            }


        }



    }
}