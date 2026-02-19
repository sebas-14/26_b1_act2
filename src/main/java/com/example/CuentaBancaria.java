package com.example;

public class CuentaBancaria {

    private String titular;
    private double saldo;
   

    public CuentaBancaria (String titular, double saldoInicial){
        this.titular = titular;

        if(saldoInicial < 0){
            this.saldo = 0;
        }
        else {
            this.saldo = saldoInicial;
        }
    }
      public void setTitular(String titular){
        this.titular = titular;
      }

       public String getTitular() 
        {
        return titular;
        }
      

      public double getSaldo(){
        return saldo;
      }

      public void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
        }
        else {
            System.out.println("error: la cantidad debe ser mayor que 0");
        }
      }

      public void retirar(double cantidad){
        if (cantidad <= 0){
            System.out.println("error: la cantidad debe ser mayor que 0");
        }
        else if (cantidad > saldo){
            System.out.println("error: fondos insuficites");
        }
        else {
            saldo -= cantidad;
        }
      }

   
}