package dp;

import java.util.Scanner;

public class algo_9095 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int t = scanner.nextInt();
	        int n;
	        
	        int[] output = new int[11]; //동적으로 생성시키니 메모리 초과가 되서 정적으로 선언
	        output[1] = 1; // 1을 넣을 경우 경우의 수 1가지(1)
	        output[2] = 2; // 2를 넣을 경우 경우의 수 2가지(1+1, 2)
	        output[3] = 4; // 3을 넣을 경우 경우의 수 3가지 (1+1+1, 1+2, 2+1, 3)
	        
	        for(int i=0; i<t; i++){
	            n = scanner.nextInt();
	            
	            for(int j=4; j<=n; j++){
	                output[j] = output[j-1] + output[j-2] + output[j-3];
	            }
	            System.out.println(output[n]);
	        }
	    }

}
