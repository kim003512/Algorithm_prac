package src;

import java.util.*;

public class algo_1912_dp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num[] = new int[n+1];
		int dp[] = new int[n+1];
		
		int max;
		
		for(int i = 1; i<=n; i++) {
			num[i]=sc.nextInt();
		}
		
		max = num[1];
		
		for(int i = 1; i<=n; i++) {
			//max = Math.max(max, max + num[i+1]);
			//if(max < max + num[i+1]) max += max+num[i+1];
			//dp[i] = Math.max(max, );
		}
	}

}
