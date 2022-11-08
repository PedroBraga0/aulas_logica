package Orientação_objeto_BancoDigital_1;

public class ContaPoupanca {

    Integer rendimento;
    Integer saldo;

    public void imprimiroSaldoeoRendimentodaConta() {
        System.out.println("\nO SEU RENDIMENTO NO MêS É DE: " + getRendimento() + " \nO SEU SALDO É DE: " + getSaldo());

    }
    public ContaPoupanca (Integer rendimento, Integer saldo) {
        this.rendimento = rendimento;
        this.saldo = saldo;
}

    public Integer getRendimento() {
        return rendimento;
    }

    public void setRendimento(Integer rendimento) {
        this.rendimento = rendimento;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

}

