package com.example.vbaenach.dsproject ;
import java.util.Observable;
import java.util.TimerTask;
import java.util.Date;



public class Clock extends Observable{
    /*Methods*/

    void Clock ()
    {
    }
    public void tick() {
        Date date = new Date();
        setChanged();
        notifyObservers(date);
        System.out.println("Se ha notificado a los observadores");
    }


    ClockTimer clockTimer= new ClockTimer(1000);

    /*Private classes*/
    private  class ClockTimer extends TimerTask {
        /*Attributes*/
        private long scheduleinms;

        /*Methods*/
        protected ClockTimer(long schedule){
          this.scheduleinms=schedule;
        };

        public long scheduledExecutionTime()
        {
         return scheduleinms ;
        }

        public void run() {
            if (System.currentTimeMillis() - scheduledExecutionTime() >=0) {
            System.out.println("cambia de schedule");

            }

        }

    }


}
