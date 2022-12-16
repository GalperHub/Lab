package com.nikita;
import com.nikita.Offer;

import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OffersList {
    public LinkedList<Offer> offers = new LinkedList<>();

    public void addNew() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пункт назначения: ");
        String destination = in.nextLine();
        System.out.println("Введите номер рейса: ");
        String id = in.nextLine();
        System.out.println("Введите фамилию пассажира: ");
        String passengerName = in.nextLine();
        System.out.println("Введите дату в формате дд/мм/гггг: ");
        String date = in.nextLine();
        offers.addLast(new Offer(destination, id, passengerName, date));
    }
    public void print(){
        for(int i = 0; i < offers.size(); i++){
            System.out.println( i + 1);
            System.out.println("Пункт назначения: " +  offers.get(i).destination);
            System.out.println("Номер рейса: " +  offers.get(i).id);
            System.out.println("Имя: " +  offers.get(i).name);
            System.out.println("Дата вылета: " +  offers.get(i).date.toString() + "\n");
        }
    }

    public void remove(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер удаляемой записи: ");
        int index = in.nextInt();
        offers.remove(index - 1);
    }

    public void printCurrent() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер рейса: ");
        String id = in.nextLine();
        System.out.println("Введите дату в формате дд/мм/гггг: ");
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(in.nextLine());
        int counter = 0;
        for(int i = 0; i < offers.size(); i++){
            if (offers.get(i).date.equals(date) && offers.get(i).id.equals(id)){
                System.out.println( ++counter);
                System.out.println("Пункт назначения: " +  offers.get(i).destination);
                System.out.println("Номер рейса: " +  offers.get(i).id);
                System.out.println("Имя: " +  offers.get(i).name);
                System.out.println("Дата вылета: " +  offers.get(i).date.toString() + "\n");
            }
        }
    }
    public void printSorted(int option){
        switch (option){
            case 1:
                Collections.sort(this.offers, new Comparator<Offer>() {
                    @Override
                    public int compare(Offer o1, Offer o2) {
                        return o1.destination.compareTo(o2.destination);
                    }
                });
                this.print();
                break;
            case 2:
                Collections.sort(this.offers, new Comparator<Offer>() {
                    @Override
                    public int compare(Offer o1, Offer o2) {
                        return o1.date.compareTo(o2.date);
                    }
                });
                this.print();
                break;
        }
    }
}
