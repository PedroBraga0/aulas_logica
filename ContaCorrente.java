package Orientação_objeto_BancoDigital_1;

public class ContaCorrente {
    Double saldo;
    Double limite;

    public void imprimirOsaldoelimitedaContaCorrente() {
        System.out.println(" \nSALDO DA CONTA CORRENTE: " + getSaldo() + " \nLIMITE DA CONTA: " + getLimite());
    }

    public ContaCorrente(Double saldo, Double limite) {
        this.limite = limite;
        this.saldo = saldo;

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

}
