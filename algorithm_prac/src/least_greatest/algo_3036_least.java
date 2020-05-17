package least_greatest;

import java.io.*;
import java.util.*;

public class algo_3036_least {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] radius = new int[n];
        for (int i = 0; i < n; i++) {
            radius[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            String answer = "";
            int gcdNum = gcd(radius[i], radius[0]);
            answer += radius[0] / gcdNum;
            answer += "/";
            answer += radius[i] / gcdNum;

            System.out.println(answer);
        }
    }

    public static int gcd(int first, int second) {
        if (second <= 0) return first;

        int temp = first;
        first = second;
        second = temp % second;

        return gcd(first, second);
    }
}
