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

    /*Attributes*/
    private Interval a_currentInterval;
    private IntervalList a_intervalList;
    private Date a_total_time_task;
}
