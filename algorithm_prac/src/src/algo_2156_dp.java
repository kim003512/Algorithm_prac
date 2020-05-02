package src;

import java.util.*;

//https://www.acmicpc.net/problem/2156
public class algo_2156_dp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//포도주 num개가 주어졌을 때, 가장 많이 마실 수 있는 양
		int drink[] = new int[num+1];
		//각 위치별 포도주의 양
		int wine[] = new int[num+1];
		
		//why 1부터 시작? (	1인 경우 예외 발생하므로?)
		for(int i = 1; i <= num; i++) {
			wine[i] = sc.nextInt();
		}
		
		//drink[1] = wine[1];
		
		//1인 경우 예외 발생
		//if(num > 1) drink[2] = wine[1] + wine[2];
		
		for(int i=3; i<= num; i++) {
			drink[i] = Math.max(drink[i-1], Math.max(wine[i]+drink[i-2], wine[i]+wine[i-1]+drink[i-3]));
		}
		System.out.println(drink[num]);
		
		sc.close();
	}

}
