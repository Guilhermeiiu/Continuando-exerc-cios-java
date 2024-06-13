public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para a conta " + contaDestino.getNumero());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }
}