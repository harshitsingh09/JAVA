public class ternary {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 15;
        int G, x;
        x = (a > b)? a : b;
        G = (x > c)? x : c;
        // G = (a < b)? ((c < b)? b : c) : a;
        System.out.println("Value of Greatest of given 3 numbers is: "+G);
    }
}
