package com.example.databse.controller;

public class herencia extends Alumno{

    int numero;
    String cargo;
    double sueldo;

    public herencia() {
    }

    public herencia(String lastname, String name, int id) {
        super(lastname, name, id);
    }

    public herencia(int numero, String cargo, double sueldo) {
        this.numero = numero;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public herencia(String lastname, String name, int id, int numero, String cargo, double sueldo) {
        super(lastname, name, id);
        this.numero = numero;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
