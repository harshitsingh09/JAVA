import java.util.*;
public class onkush_challenge {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the start value and end value:");
        int n = x.nextInt();
        int m = x.nextInt();
        String [] arr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        for (int i = n - 1; i <= m; i++){
            if (i < 10){
                System.out.println(arr[i]);
            }
            else{
                if (i % 2 == 0){
                    System.out.println("EVEN");
                }
                else{
                    System.out.println("ODD");
                }
            }
        }
        x.close();
    }
}