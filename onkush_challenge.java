//import java.util.Scanner;
public class onkush_challenge {
    public static void main(String[] args) {
        //Scanner x = new Scanner(System.in);
        //int n = (int) x;
        int n = 12;
        String [] arr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        for (int i = 0; i < n; i++){
            if (i < 9){
                System.out.println(arr[i]);
            }
            else{
                if (i%2 == 0){
                    System.out.println("EVEN");
                }
                else{
                    System.out.println("ODD");
                }
            }
        }
    }
}
