package com.example.vbaenach.dsproject ;
import java.util.Observable;
import java.util.TimerTask;


public class Clock extends Observable{
    /*Methods*/

    /*Private classes*/
    private abstract class ClockTimer extends TimerTask {
    }
    /*Attributes*/
    private ClockTimer clockTimer;
}
