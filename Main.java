package com.java;


public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(29, "Rafael", 666999000, 3226.78f);

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        System.out.println(" ");

        Trabajador trabajador = new Trabajador(26, "Marisa", 666111222, 1050.75);

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);







    }
}
