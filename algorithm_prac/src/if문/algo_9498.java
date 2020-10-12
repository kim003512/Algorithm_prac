package if¹®;

import java.util.Scanner;

public class algo_9498 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String grade;
		
		int num = s.nextInt();
		
		if(num>=90 && num <= 100) grade = "A";
		else if(num>=80 && num <= 89) grade = "B";
		else if(num>=70 && num <= 79) grade = "C";
		else if(num>=60 && num <= 69) grade = "D";
		else grade = "F";
		
		System.out.println(grade);
	}
}
