package com.company;

public class Advance extends Ticket
{
    private int daysInAdvance;

    public Advance (int days)
    {
        daysInAdvance = days;
    }

    public double getPrice()
    {
        if (daysInAdvance >= 10)
            return 30.0;
        else
            return 40.0;
    }
}