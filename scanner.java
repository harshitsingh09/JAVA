import java.util.*;
public class scanner{
    public static void main(String[] args) {
        System.out.println("Are you above 18?");
        Scanner sc = new Scanner(System.in);
        boolean bn = sc.nextBoolean();
        if (bn == true){
            System.out.println("You are eligible to vote!");
        }
        else{
            System.out.println("You are under 18.");
        }
        sc.close();
    }
}