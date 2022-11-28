import java.util.*;

interface Arithmetic {
    int operation(int a, int b);
}
public class lambdaExp {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter 2 operands: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        //Addition using Lambda expression
        Arithmetic addition = (int a, int b) -> (a + b);

        //Arithmetic addition = (int a, int b) -> {return a + b;};
        System.out.println ("Addition = " + addition.operation(x,y));

        //Subtraction using Lambdaexpression
        Arithmetic subtraction=(int a, int b) -> (a - b);

        //Arithmeticaddition=(inta,intb)->{returna-b;};
        System.out.println ("Subtraction = " + subtraction.operation(x,y));

        //Multiplication using Lambda expression
        Arithmetic multiplication = (int a, int b) -> (a * b);

        //Arithmeticaddition=(inta,intb)->{returna*b;};
        System.out.println ("Multiplication = " + multiplication.operation(x,y));

        //DivisionusingLambdaexpression
        Arithmetic division = (int a, int b) -> (a / b);

        //Arithmeticaddition=(inta,intb)->{returna*b;};
        System.out.println ("Division = " + division.operation(x,y));

        in.close();
    }
}
