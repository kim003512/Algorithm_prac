package dp;

import java.util.*;

//https://www.acmicpc.net/problem/11726
public class algo_11726_dp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dp[] = new int[n+1];
		
		dp[1] = 1;
		
		//런타임 에러 방지??
		if(n>=2) dp[2]=2;
		
		for(int i = 3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] = dp[i] % 1007;  //
		}
		
		System.out.println(dp[n]);
	}

}
