package com.nikita;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Offer {
    String destination;
    String id;
    String name;
    Date date;
    public Offer (String destination, String id, String name, String date) throws ParseException {
        this.destination = destination;
        this.id = id;
        this.name = name;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public String getName() {
        return name;
    }
}
