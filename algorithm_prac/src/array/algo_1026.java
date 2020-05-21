package array;

import java.util.*;

public class algo_1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		
		int[] A = new int[N], B = new int[N];
		int sum = 0;

		
		for(int i = 0; i<N ;i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
//		int bigB = B[0];
//		
//		for(int i = 0; i<B.length; i++) {
//			if(bigB < B[i]) bigB=B[i];
//		}
		Arrays.sort(B);
		
		for(int i = 0; i<N; i++) {
			sum += A[i] * B[N-1-i];
		}
		
		System.out.println(sum);
	}
}
