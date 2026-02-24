package com.example;

public class mainbanco {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);

        cuenta.depositar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        try {
            cuenta.retirar(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}