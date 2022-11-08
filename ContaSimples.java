package Orientação_objeto_BancoDigital_1;

public class ContaSimples {

    Integer saldo;

    public void imprimiroSaldo() {
        System.out.println("\nO SALDO BANCÁRIO DA SUA CONTA SIMPLES : " + getSaldo());
    }
    public ContaSimples ( Integer saldo) {
        this.saldo = saldo;
    }
    public Integer getSaldo() {
        return saldo;
    }


    }


