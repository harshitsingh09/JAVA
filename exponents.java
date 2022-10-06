/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
*/
public class exponents{
    public static void main(String[] args) {
        double x = 9.1;
        int n = 3;
        double power = myPow(x, n);
        System.out.println(power);
    }
    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }
}
