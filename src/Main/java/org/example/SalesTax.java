package org.example;

public class SalesTax {
    public static void main(String[] args) {
        double salesTax = 0.05;
        double itemTax = 0;
        double itemPrice = 100;
        double totalPrice = 0;

        itemTax = salesTax * itemPrice;
        totalPrice = itemPrice + itemTax;

        System.out.println("For the item worth $" + itemPrice + ", the sales tax is $" + itemTax + ". That makes the total price $" + totalPrice);
    }
}
