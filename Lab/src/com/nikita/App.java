package com.nikita;
import java.text.ParseException;
import java.util.Scanner;
import java.util.LinkedList;

public class App {
    public OffersList data;
    public App(OffersList data){
        this.data = data;
    }

    public void init() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа для хранения данных авиабилетов\n\n");
        while(true){
            System.out.println("1. Добавление заявки в список");
            System.out.println("2. Удаление заявки из списка");
            System.out.println("3. Вывод заявки по заданному номеру рейса и дате вылета");
            System.out.println("4. Вывод всех заявок, упорядоченных по пунктам назначения");
            System.out.println("5. Вывод всех заявок, упорядоченных по датам вылета");
            System.out.println("6. Выход\n\n");
            System.out.println("Введите действие: ");
            int option = in.nextInt();
            switch (option){
                case 1:
                    data.addNew();
                    break;
                case 2:
                    data.remove();
                    break;
                case 3:
                    data.printCurrent();
                    break;
                case 4:
                    data.printSorted(1);
                    break;
                case 5:
                    data.printSorted(2);
                    break;
            }
        }
    }
}
