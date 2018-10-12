package com.example.vbaenach.dsproject ;
import java.util.Observable;
import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;
public class Clock extends Observable {
    /*Atrributes*/
    /*ClockTimer clockTimer = new ClockTimer(1000);
    /*Methods*/
    ClockTimer timertask = new ClockTimer(this);
    public Clock(int timeDelay) {
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(timertask, 0, 1000*timeDelay);
    };
    public void tick() {
            Date date = new Date();
            setChanged();
            //System.out.println(date);
            notifyObservers(date);
            //System.out.println("Se ha notificado a los observadores");
    }
    public void start(){
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

        public void run() {
            clock.tick();
        }
    }
}