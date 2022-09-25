public class avsek_challenge {
    public static void main(String[] args) {
        byte a, b, c;
         a = 10;
         b = 20;
         c = 15;
         System.out.println("Value of Greatest of given 3 numbers is: "+((a < b)? ((c < b)? b : c) : a));
    }
}
