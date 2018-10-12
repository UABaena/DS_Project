package com.example.vbaenach.dsproject;

import java.io.Serializable;

public abstract class Activity implements Serializable {
    /*Constructors*/

    public Activity(String a_name) {
        this.a_name = a_name;
    }

    public Activity(String a_name, String a_desc) {
        this.a_name = a_name;
        this.a_desc = a_desc;
    }

    public String getName(){return a_name;}
    public String getDesc(){return a_desc;}
    /*Methods*/
            /*Attributes*/
    private String a_name;
    private String a_desc;
}