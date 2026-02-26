package springboot.desafio.itau.model;

import java.time.OffsetDateTime;

public class Transaction {
    private double valor;
    private OffsetDateTime dataHora;

    public Transaction(double val, OffsetDateTime date){
        this.valor = val;
        this.dataHora = date;

    }

    public double getVal() {
        return valor;
    }

    public OffsetDateTime getDate() {
        return dataHora;
    }

}
