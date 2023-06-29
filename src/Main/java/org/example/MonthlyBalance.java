package org.example;

public class MonthlyBalance {
    public static void main(String[] args) {
        int cardBalance = 5000;
        double interestRate = 0.17;
        double firstMonth = 0;
        double secondMonth = 0;

        firstMonth = cardBalance * interestRate;
        secondMonth = cardBalance * (interestRate * 2);

        System.out.println("The interest after one month is $" + firstMonth + " and the interest after second month is $" + secondMonth);
    }
}
