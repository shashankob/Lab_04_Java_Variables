package org.example;

import org.w3c.dom.ls.LSOutput;

public class EvenOdd {
    public static void main(String[] args) {
        int numToExamine = 3;

        if (numToExamine % 2 == 0) {
            System.out.println(numToExamine + " is an even number!"); }
        else {
            System.out.println(numToExamine + " is an odd number!");
        }
    }
}