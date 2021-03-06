package com.company;

import java.util.Scanner;

public class ComputeWage {

    private String name;
    private double gtotal;
    private int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGtotal() {
        return gtotal;
    }

    public void setGtotal(double gtotal) {
        this.gtotal = gtotal;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void AcceptData()
    {
        boolean inputValid = false;

        Scanner key = new Scanner(System.in);

        System.out.println("Enter the name: ");
        name = key.nextLine();

        while(!inputValid)
        {
            System.out.println("Enter hours: ");
            String input = key.next();

            try
            {
                hours = Integer.parseInt(input);
                inputValid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("You didn't enter a valid number!!");
            }
        }
    }

    public double computeWage()
    {
        if(this.hours>40)
        {
            gtotal = (40 * 15) + (16.5 * (hours - 40));
        }
        else
        {
            gtotal = hours * 15;
        }

        return gtotal;
    }

    public void display()
    {
        System.out.println("The total wage of " + this.name + " is " + this.gtotal);
    }
}
