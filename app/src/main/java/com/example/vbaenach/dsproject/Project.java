package com.example.vbaenach.dsproject;
import java.util.Date;

public class Project extends Activity {
    /*Constructors*/
    public Project(String nameProj) {
        super(nameProj);
    }

    public Project(String nameProj, String desc) {
        super(nameProj, desc);
    }

    /*Methods*/
    /*Attributes*/
    private ActivityList p_activityList;
    private Date p_totalTimeProject;

}