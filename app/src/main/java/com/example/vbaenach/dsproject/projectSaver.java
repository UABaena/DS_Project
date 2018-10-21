package com.example.vbaenach.dsproject;

import java.io.Serializable;

/*Class that will save our project into a file and recover it*/
public class projectSaver implements Serializable {
    public projectSaver(Project proj){
        this.projectAplication = proj;

    }
    private Project projectAplication;
}
