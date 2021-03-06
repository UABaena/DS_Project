package com.example.vbaenach.dsproject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
public class Project extends Activity {
    /*Constructors*/
    public Project(String nameProj) {
        super(nameProj,null);
        p_activityList = new ArrayList<Activity>();
    }
    public Project(String nameProj, String desc) {
        super(nameProj, desc);
        p_activityList = new ArrayList<Activity>();
    }
    /*Methods*/
    public void addActivityProject(Activity activity){
        p_activityList.add(activity);
    }
    public Date getP_totalTimeProject(){        return p_totalTimeProject;    }

    public ArrayList<Activity> getP_activityList() {return p_activityList;}
    public Activity getActByName (String act){
        return p_activityList.get(p_activityList.indexOf(act));
    }
    /*Attributes*/
    private ArrayList<Activity> p_activityList;
    private Date p_totalTimeProject;

}