package com.example.vbaenach.dsproject;

public class MainApplication {
    public static void main(String [] args){



        System.out.println("Hello funciona!");
        Clock clock= new Clock();

        clock.start();


        Interval interval = new Interval(clock);
        clock.addObserver(interval);

        Interval interval2 = new Interval(clock);
        clock.addObserver(interval2);

        Project proj1 = new Project("Projecte1", "Desc proj1");
        Tasks tasca1_1 = new Tasks("Tasca1.1", "Desc tasca 1.1");
        Tasks tasca1_2 = new Tasks("Tasca1.2", "Desc tasca 1.2");
        Tasks tasca1_3 = new Tasks("Tasca1.3", "Desc tasca 1.3");
        Project proj2 = new Project("SubProj2", "Desc subtasca1");
        Tasks tasca2_1 = new Tasks("Subtasca 1", "Desc subtasca1");
        proj1.addActivityProject(tasca1_1);
        proj1.getP_activityList().add(tasca1_2);
        proj1.addActivityProject(tasca1_3);
        proj1.getP_activityList().add(proj2);
        proj2.addActivityProject(tasca2_1);
        for (int i = 0; i < proj1.getP_activityList().size();i++){
            System.out.println("Nom: "+proj1.getP_activityList().get(i).getName()+ " Desc: "+ proj1.getP_activityList().get(i).getDesc());
        }
        for (int i = 0; i < proj2.getP_activityList().size();i++){
            System.out.println("Nom: "+proj2.getP_activityList().get(i).getName()+ " Desc: "+ proj2.getP_activityList().get(i).getDesc());
        }












        }
    }


