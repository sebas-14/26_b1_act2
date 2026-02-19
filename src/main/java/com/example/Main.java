package com.example;

public class Main
{
    public static void main (String[] args)
    {
        Libro l1 = new Libro();
        l1.mostrarDetalles();

        Libro l2 = new Libro("Harry potter ", "j.k. rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("el señor de los anillos", "j.r.r. tolkien", 1200);
        l3.mostrarDetalles();
    }
}