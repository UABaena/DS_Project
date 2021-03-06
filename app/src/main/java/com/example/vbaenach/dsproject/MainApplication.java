package com.example.vbaenach.dsproject ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApplication {
    public static Project creaArbreTest(){
        Project proj1 = new Project("P1", "D1");
        Tasks tasca1_1 = new Tasks("T3", "Desc t3");
        Tasks tasca1_2 = new Tasks("T2", "Desc t2");
        Project proj2 = new Project("P2", "D");
        Tasks tasca2_1 = new Tasks("T1", "Desc t1");
        proj1.addActivityProject(tasca1_1);
        proj2.getP_activityList().add(tasca1_2);
        proj2.addActivityProject(tasca2_1);
        proj1.getP_activityList().add(proj2);
        return proj1;
    }
    public static void saveProject(Project proj,String path){
        try {
            FileOutputStream arxiu = new FileOutputStream(path);
            ObjectOutputStream sortida = new ObjectOutputStream(arxiu);
            sortida.writeObject(proj);
            sortida.close();
            arxiu.close();
            System.out.println("Objecte desat correctament");
        } catch (IOException e) {
            System.out.println("Error: "+e);
        }
    }
    public static Project loadProject(String path){
        Project proj = new Project("ProjectNotFound","Unable to load project");
        try {
            FileInputStream arxiu = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(arxiu);
            proj = (Project)in.readObject();
            in.close();
            arxiu.close();
            return proj;
        } catch (IOException e) {
            System.out.println("Error: "+e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: "+e);
        }
        finally {
            return proj;
        }
    }

    public static int test(){
        /*Path to load and save our project*/
        String path = "./FILE_BACKUP.ser";
        int errors = 0;
        //1. Iniciar la aplicaci´o i crear l’estructura de projectes i tasques anterior
        //2. Indicar que el temps es comptar`a cada dos segons i per tant que la sortida de la aplicaci´o
        //s’actualitzar`a o mostrar`a tamb´e amb aquesta periodicitat.
        //Project proj2segons = creaArbreTest();
        int timeDelay = 2;

        //3. Comen¸car a cronometrar la tasca T3. A partir d’aquest moment s’ha de s’ha de mostrar
        //com es va comptant el temps imprimint cada 2 segons com a les taules 1 a 3. No cal que
        //us hi feu en el format de la taula, nom´es que les columnes estiguin ben indendates per
        //poder llegir-ne el contingut. No cal sobreescriure la taula si no voleu, simplement anar-la
        //reimprimint.

        /*Clock clock= new Clock(timeDelay);
        clock.start();

        Interval interval = new Interval(clock);
        clock.addObserver(interval);*/
        //saveProject(proj2segons,path);
        Project projectLoaded = loadProject(path);
        System.out.println(projectLoaded.getName());



        //4. Esperar 3 segons i parar el cron`ometre de la tasca T3. Haur´ıem de veure ara la taula 1.

        //5. Esperar 7 segons m´es.

        //6. Engegar el cron`ometre per la tasca T2.

        //7. Esperar 10 segons i llavors parar el cronometratge de T2.

        //8. Cronometrar altre cop T3 durant 2 segons. Haur´ıem de veure ara la taula 2.

        return errors;
    }

    public static void main(String [] args){

        System.out.println("Inicio programa!\n");
        test();
    }
}