package org.example;

public class YearlyCost {
    public static void main(String[] args) {
        double seasonSummer = 50;
        double seasonWinter = 50;
        double seasonSpring = 50;
        double seasonFall = 50;
        double totalYear = 0;

        totalYear = seasonSummer + seasonFall + seasonSpring + seasonWinter;


        System.out.println("The total yearly maintenance cost for all four seasons is $" + totalYear);
    }
}