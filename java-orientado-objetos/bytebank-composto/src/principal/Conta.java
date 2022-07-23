package principal;

public class Conta {
    private Double saldo = 0.0;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
