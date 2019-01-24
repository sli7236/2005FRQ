package com.company;

public class Runner {

    public static void main(String[] args) {
	    Walkup w = new Walkup();
        Advance a1 = new Advance(10);
        Advance a2 = new Advance(5);
        StudentAdvance s1 = new StudentAdvance(10);
        StudentAdvance s2 = new StudentAdvance(5);

        System.out.println("Walkup Ticket \n" + w.toString());
        System.out.println("\nAdvance Ticket, 10 Days \n" + a1.toString());
        System.out.println("\nAdvance Ticket, 5 Days \n" + a2.toString());
        System.out.println("\nStudent Advance Ticket, 10 Days \n" + s1.toString());
        System.out.println("\nStudent Advance Ticket, 5 Days \n" + s2.toString());
    }
}
