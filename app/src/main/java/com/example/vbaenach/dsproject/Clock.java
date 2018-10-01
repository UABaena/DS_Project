package com.example.vbaenach.dsproject ;
import java.util.Observable;
import java.util.TimerTask;
import java.util.Date;





public class Clock extends Observable {

    /*Atrributes*/
    /*ClockTimer clockTimer = new ClockTimer(1000);
    /*Methods*/

    public Clock() {};

    public void tick() {

            Date date = new Date();
            setChanged();
            System.out.println(date);
            notifyObservers(date);
            System.out.println("Se ha notificado a los observadores");

    }

    public void s(){
        ClockTimer timertask = new ClockTimer(this);
        timertask.run();

    }

    /*Private classes*/
    private class ClockTimer extends TimerTask {
        /*Attributes*/

        Clock clock;
        /*Methods*/
        protected ClockTimer(Clock c) {
            this.clock = c;
        }
        ;
        public void run() {
            while (true){
                clock.tick();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            }

        }

    }



