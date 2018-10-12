package com.example.vbaenach.dsproject;
import java.util.Observable;
import java.util.Observer;
import java.util.Date;
public class Interval implements Observer {

    Date initalDate;
    Date finalDate;
    int iniciFi=0;
    public  Interval(Clock clock) {
        clock.addObserver(this);
    }
    public Date getStart(){
        return this.initalDate;
    }
    public Date getStop(){
        return this.finalDate;
    }
    public void start(){
        this.iniciFi = 0;
    }
    public void stop(){
        this.iniciFi = 1;
    }

    @Override
    public void update(Observable arg0, Object arg1) {

        Date presentDate = (Date) arg1;

        if (iniciFi==0)
        {
            this.initalDate=presentDate;
            iniciFi++;
        }
        if (iniciFi==1){
            this.finalDate=presentDate;
            iniciFi--;
        }

        //System.out.println("Data a l'observer");
        System.out.println(presentDate);
    }

}