public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 3;
        int intSum = 5;
        int intProduct = 8;
        int intDifference = 13;
        int intQuotient = 12;
        int intModulo = 22;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " & " + intOperandB +  " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " & " + intOperandB +  " is " + intProduct);
        intDifference = intOperandA + intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " & " + intOperandB +  " is " + intDifference);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The division using ints of " + intOperandA + " & " + intOperandB +  " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " & " + intOperandB +  " is " + intModulo);



        double doubleOperandA = 3.50;
        double doubleOperandB = 4.50;
        double doubleSum = 6.50;
        double doubleProduct = 8.50;
        double doubleDifference = 12.50;
        double doubleQuotient = 15.50;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using ints of " + doubleOperandA + " & " + doubleOperandB +  " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using ints of " + doubleOperandA + " & " + doubleOperandB +  " is " + doubleProduct);
        doubleDifference = doubleOperandA + doubleOperandB;
        System.out.println("The difference using ints of " + doubleOperandA + " & " + doubleOperandB +  " is " + doubleDifference);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The division using ints of " + doubleOperandA + " & " + doubleOperandB +  " is " + doubleQuotient);
    }

}