package dp;

import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/9461
public class algo_9461_dp {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long[] P = new long[101];
		P[1] = 1; P[2] = 1; P[3] = 1; P[4] = 2; P[5] = 2;
		
		for(int i = 6; i<= 100; i++) {
			P[i] = P[i-1] + P[i -5];
		}
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(P[N] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
