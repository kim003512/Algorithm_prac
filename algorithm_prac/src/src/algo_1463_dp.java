package src;

import java.util.*;

//https://www.acmicpc.net/problem/1463
//틀렸습니다.
//이런 경우 어느 조건이 더 효율적인지? 따지지 않고 그냥 되면 계산을 하기때문에 틀림??
//public class algo_1463_dp {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		int count = 0;
//		
//		while(num > 1) {
//			if(num % 3 == 0) num /= 3;
//			else if(num % 2 == 0) num /= 2;
//			else num -= 1;
//			
//			count++;
//		}
//		
//		System.out.println(count);
//	}
//}


public class algo_1463_dp{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		//배열을 만들어 계산횟수를 1씩 증가시키다가 어느 계산이 빠른지 확인하며 계산횟수 배열에 최솟값을 계속 넣어준다.
		//10의 6승
		//int[] count = new int[1000001];
		int[] count = new int[num+1];
		
		//num이 1이거나 0일 경우 연산의 수는 0번이므로 2부터 시작
		//count[0] = 0;
		//count[1] = 0;
		
		for(int i = 2; i <= num; i++) {
			count[i] = count[i-1] + 1;
			//..................?
			//2와 3으로 둘 다 나누어 지는 경우가 있기 때문에 무엇이 더 좋을지를 알기?위해서는 if로 써야됨
			if(i % 2 == 0) 
				count[i] = Math.min(count[i], count[i/2] + 1);
			//else if로 쓰면 왜 안되는가
			if(i % 3 == 0) 
				count[i] = Math.min(count[i], count[i/3] + 1);
			
			//이걸로 해도 맞음
//			if(i % 3 == 0) 
//				count[i] = Math.min(count[i], count[i/3] + 1);
//			//else if로 쓰면 왜 안되는가
//			else if(i % 2 == 0) 
//				count[i] = Math.min(count[i], count[i/2] + 1);
		}
		System.out.println(count[num]);
		sc.close();
	}
}