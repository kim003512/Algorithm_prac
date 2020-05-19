package dp;

import java.util.*;

public class algo_1890_dp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int game[][] = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				game[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
	}

}
