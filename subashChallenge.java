import java.util.*;

public class subashChallenge{
	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int k = 0; k < r * c; k++) {arr[k / c][k % r] = sc.nextInt();}
        sc.close();
	}
}