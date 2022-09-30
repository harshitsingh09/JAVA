import java.util.*;
public class onkushProblem {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the start value and end value:");
        int n = x.nextInt();
        int m = x.nextInt();
        String [] arr = { " ","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (n > 0 && n <= 9){
            for (int i = n; i <= 9; i++){
                System.out.println(arr[i]);
            }
        }
        for (int i = 10; i <= m; i++){
            if (i % 2 == 0){
                System.out.println("EVEN");
            }
            else{
                System.out.println("ODD");
            }
        x.close();
        }
    }
}