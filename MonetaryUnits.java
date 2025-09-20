package monetary.units;

import java.util.Scanner;

public class MonetaryUnits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dollar;
        System.out.println("A value for $");
        dollar = input.nextDouble();
        int dollarInteger = (int) dollar;
        double dollarDecimal = dollar - dollarInteger;

        double quarter, dimes, nickles, pennis;
        quarter = dollarInteger * 4d;
        dimes = dollarInteger * 10d;
        nickles = dollarInteger * 100d;
        pennis = dollarDecimal / 5d;
        
        System.out.println("The value in quarter is" + quarter);
        System.out.println("The value in dimes is" + dimes);
        System.out.println("The value in nickles is" + nickles);
        System.out.println("The vallue in pennis is" + pennis);
    }

}
