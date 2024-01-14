package org.example;

import java.math.BigDecimal;

public class Transaction {

    private Double sender;
    private Double receiver;
    private Double value;

    public Double getSender() {
        return sender;
    }

    public void setSender(Double sender) {
        this.sender = sender;
    }

    public Double getReceiver() {
        return receiver;
    }

    public void setReceiver(Double receiver) {
        this.receiver = receiver;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Transaction(Double sender, Double receiver, Double value) {
        this.sender = sender;
        this.receiver = receiver;
        this.value = value;
    }

    public Transaction() {
    }

    public void validateTransaction(Double value, Double sender){
        if(value > sender){
            throw new RuntimeException();
        }
    }
}
