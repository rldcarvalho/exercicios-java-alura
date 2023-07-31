package br.com.rldcarvalho;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private BigDecimal limite;
    private BigDecimal saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = BigDecimal.valueOf(limite);
        this.saldo = this.limite;
        this.compras = new ArrayList<>();
    }

    public boolean addCompra(Compra compra){

        if (this.verificaLimite(compra.getValor())){
            this.saldo = this.saldo.subtract(compra.getValor());
            compras.add(compra);
            return true;
        }

        return false;
    }

    private boolean verificaLimite(BigDecimal valor) {
        return this.saldo.compareTo(valor) >= 0;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
