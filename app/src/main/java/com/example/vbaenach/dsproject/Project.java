package com.example.vbaenach.dsproject;
import java.util.ArrayList;
import java.util.Date;

public class Project extends Activity {
    /*Constructors*/
    public Project(String nameProj) { super(nameProj,null);}
    public Project(String nameProj, String desc) {
        super(nameProj, desc); p_activityList = null;
    }
    /*Methods*/
    public Date getP_totalTimeProject(){        return p_totalTimeProject;    }

    public ArrayList<Activity> getP_activityList() {return p_activityList;}

    /*Attributes*/
    private ArrayList<Activity> p_activityList;
    private Date p_totalTimeProject;
}