package model;

import java.time.OffsetDateTime;

public class Transaction {
    private double val;
    private OffsetDateTime date;

    public Transaction(double val, OffsetDateTime date){
        this.val = val;
        this.date = date;

    }

    public double getVal() {
        return val;
    }

    public OffsetDateTime getDate() {
        return date;
    }

}
