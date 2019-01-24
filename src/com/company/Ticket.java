package com.company;

public abstract class Ticket {
    private int serialNumber;

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();

    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private int getNextSerialNumber() {
        return serialNumber + 1;
    }
}