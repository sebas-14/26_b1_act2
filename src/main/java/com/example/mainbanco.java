package com.example;


public class mainbanco {

    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria("maria", 500);

        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo());

        cuenta.retirar(1000);
    }

}