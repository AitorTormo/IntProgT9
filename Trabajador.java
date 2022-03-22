package com.java;

public class Trabajador extends Persona{

    Double salario;

    public Trabajador() {
    }

    public Trabajador(int edad, String nombre, int telefono, Double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
}
