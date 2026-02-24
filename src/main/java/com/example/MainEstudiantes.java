package com.example;

public class MainEstudiantes {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante();
        e1.mostrarInfo();

        System.out.println("\n");

        Estudiante e2 = new Estudiante("Pedro", 21, 2.5);
        e2.mostrarInfo();

        System.out.println("\n");

        Estudiante e3 = new Estudiante("Laura", 19, 4.3);
        e3.mostrarInfo();

        System.out.println("\n");

        Estudiante e4 = new Estudiante("Carlos", -5, 3.5);
        e4.mostrarInfo();
    }
}
