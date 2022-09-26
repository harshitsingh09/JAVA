import java.util.*;
public class calculator 
{
   public static void main(String[] args)
   {
      Scanner o = new Scanner(System.in);
      int a,b;
      char c;
      System.out.println("Enter the first number : ");
      a = o.nextInt();
      System.out.println("Enter the second number : ");
      b = o.nextInt();
      System.out.println("Enter the operation to be performed [ + , - , / , * , % ] : ");
      c = o.next().charAt(0);
      switch (c) {
        case '+':
            System.out.println(a+ " + "+b +" = "+(a+b) );
            break;
        case '-':
            System.out.println(a+ " - "+b +" = "+(a-b) );
            break;
        case '*':
            System.out.println(a+ " * "+b +" = "+(a*b) );
            break;
        case '/':
            System.out.println(a+ " / "+b +" = "+(a/b) );
            break;
        case '%':
            System.out.println(a+ " % "+b +" = "+(a%b) );
            break;
        default:
        System.out.println("Invalid input ! ");
            break;
      }
      o.close(); 
   }    
}