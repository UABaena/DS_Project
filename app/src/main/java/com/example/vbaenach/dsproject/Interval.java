package com.example.vbaenach.dsproject;

import java.util.Observable;
import java.util.Observer;
import java.util.Date;

public class Interval implements Observer {

    Date initalDate;
    Date finalDate;


    public  Interval(Clock clock) {
        clock.addObserver(this);


    }

    @Override
    public void update(Observable arg0, Object arg1) {
        int k=0;
        Date presentDate = (Date) arg1;

        if (k==0)
        {
            this.initalDate=presentDate;
            k++;
        }
        System.out.println("Data a l'observer");
        System.out.println(presentDate);
    }


};



