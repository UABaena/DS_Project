package com.example.vbaenach.dsproject;

import java.util.Date;

public class Tasks extends Activity{
    /*Constructors*/
    public Tasks(String name) {
        super(name,null);
    }

    public Tasks(String name, String desc) {
        super(name, desc);
    }

    /*Methods*/
    public void startTasca(){
        a_currentInterval.start();
    }
    public void stopTask(){
        a_currentInterval.stop();
        a_total_time_task.setTime(a_currentInterval.getStart().getTime() - a_currentInterval.getStop().getTime());
    }

    public Interval getA_currentInterval() {
        return a_currentInterval;
    }

    /*Attributes*/
    private Interval a_currentInterval;
    private IntervalList a_intervalList;
    private Date a_total_time_task;
}