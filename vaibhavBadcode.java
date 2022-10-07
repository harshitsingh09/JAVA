import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class vaibhavBadcode{
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(sieve(n));
    }

    static Boolean isPrime(int n){
        if (n <= 1) return false;
        boolean flag = true;
        for(int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    static boolean isMultiple(int a, int b){
        if (a % b == 0) return true;
        return false;
    }

    static List<Integer> sieve(int n){
        int[] arr = new int[n];

        for(int i = 1; i <= n ;i++){
            arr[i - 1] = i;
        }

        System.out.println(Arrays.toString(arr));

        boolean[] primeCheck = new boolean[n];

        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
           for(int j = 1; j < arr.length; j++) {
                if (isPrime(arr[i]) && !isMultiple(i,j)){
                    primeCheck[i] = true;
                }
            }
        }

        for (int i = 0; i < primeCheck.length; i++){
            if (primeCheck[i]){
                primes.add(arr[i]);
            }
        }

        System.out.println(primes);
        return primes;
    }
}