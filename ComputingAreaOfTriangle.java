package computing.area.of.triangle;

import java.util.Scanner;

public class ComputingAreaOfTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1, x2, x3, y1, y2, y3;
        System.out.println(" Please Enter The value for x1 ");
        x1 = input.nextDouble();
        System.out.println(" Please Enter The value for x2 ");
        x2 = input.nextDouble();
        System.out.println(" Please Enter The value for x3 ");
        x3 = input.nextDouble();
        System.out.println(" Please Enter The value for y1 ");
        y1 = input.nextDouble();
        System.out.println(" Please Enter The value for y2 ");
        y2 = input.nextDouble();
        System.out.println(" Please Enter The value for y3 ");
        y3 = input.nextDouble();

        double a, b, c;

        a = Math.sqrt(Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2));
        b = Math.sqrt(Math.pow(x3 - x1, 2)) + (Math.pow(y3 - y1, 2));
        c = Math.sqrt(Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));

        System.out.println(" The first side is " + a);
        System.out.println(" The second side is " + b);
        System.out.println(" The third side is " + c);

        double A, B, C;
        A = Math.toDegrees((Math.acos((b * b + c * c - a * a) / (2 * b * c))));
        B = Math.toDegrees((Math.acos((c * c + a * a - b * b) / (2 * a * c))));
        C = Math.toDegrees((Math.acos((a * a + b * b - c * c) / (2 * a * b))));

        System.out.println("The First angle is " + A);
        System.out.println("The Second angle is " + B);
        System.out.println("The Third angle is " + C);

    }

}
