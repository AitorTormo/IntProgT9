package com.java;

public class Cliente extends Persona {


    float credito;

    public Cliente(){
    }

    public Cliente(int edad, String nombre, int telefono, float credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
}
