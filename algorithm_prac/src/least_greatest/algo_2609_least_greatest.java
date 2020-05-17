package least_greatest;

import java.util.*;

public class algo_2609_least_greatest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        
        long gcd = getGCD(Math.max(num1, num2), Math.min(num1, num2));
        long lcm = getLCM(num1, num2, gcd);
        
        System.out.println(gcd);
        System.out.println(lcm);
    }
 
    public static long getGCD(long a, long b) {
        while(b > 0) {
            long tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    
    public static long getLCM(long a, long b, long gcd) {
        return (a*b)/gcd;
    }
}
