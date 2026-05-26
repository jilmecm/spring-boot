package com.example.databse.controller;

public class Alumno {

    int id;
    String name;
    String lastname;

    public Alumno() {
    }

    public Alumno(String lastname, String name, int id) {
        this.lastname = lastname;
        this.name = name;
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public void mostrarNombre() {}

    public void saberAprovado (double calificacion){
        if (calificacion >= 6){
            System.out.printf("aprovo");
        }else {
            System.out.println("no aprobo" );
        }
    }


}
