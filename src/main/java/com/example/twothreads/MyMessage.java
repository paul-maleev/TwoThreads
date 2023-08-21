package com.example.twothreads;

import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;

public class MyMessage {

    SimpleStringProperty name = new SimpleStringProperty();
    SimpleStringProperty message =new SimpleStringProperty();
    SimpleStringProperty time = new SimpleStringProperty();

    {
        name.set(Thread.currentThread().getName());
        message.set("Получено сообщение от объекта с ID "+System.identityHashCode(this));
        time.set(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()));
    }


    public SimpleStringProperty nameProperty () {
        name.set(Thread.currentThread().getName());
        return name;
    }

    @Override
    public String toString () {
        return "MyMessage{" +
                "name=" + name +
                ", message=" + message +
                ", time=" + time +
                '}';
    }

    public SimpleStringProperty messageProperty () {

        message.set("Получено сообщение от объекта с ID "+System.identityHashCode(this));
        return message;
    }


    public SimpleStringProperty timeProperty () {
        time.set(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()));
        return time;
    }
}
