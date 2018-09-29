package com.example.vbaenach.dsproject;

public class MainApplication {
    public static void main(String [] args){
        /*Mostrar reloj hora actual cada 2 segundos*/


        System.out.println("Hello funciona!");


        Interval observador = new Interval();
        Clock clock= new Clock();
        clock.addObserver(observador);
        clock.tick();





        }
    }



