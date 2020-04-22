package src;

import java.util.Scanner;
import java.util.Stack;

//public class algo_10828 {
//	public static void main(String[] args) {
//		//스택 크기 받아오기
//		Scanner stack_size = new Scanner(System.in);
//
//		//받아온 스택 사이즈로 스택 생성
//		int st_size;
//		st_size = stack_size.nextInt();
//
//		if(st_size<1 || st_size>10000) {
//			System.out.println("1~10000사이의 숫자를 입력하세요!");
//		}else {
//			stack st = new stack(st_size);
//
//			//스택 명령어 받아오기
//			Scanner stack_order = new Scanner(System.in);
//			String order;
//			order = stack_order.next();
//			
//			if(order == "push") {
//				st.push(stack_order.nextInt());
//			}else if(order == "pop") {
//				st.pop();
//			}else if(order == "size") {
//				System.out.println(st.size);
//			}else if(order == "empty") {
//				st.empty();
//			}else if(order == "top") {
//				st.top();
//			}else {
//				System.out.print("실행할 수 없는 명령어입니다.");
//			}
//		}
//	}
//}
//
//class stack{
//	int top;
//	int[] stack;
//	int size;
//
//	//size: 스택에 들어있는 정수의 개수를 출력한다.
//	public stack(int size) {
//		top = -1; 
//		stack = new int[size];
//		this.size= size;
//
//		System.out.println(size);
//	}
//
//	//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
//	//만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	public int pop() {
//		if(top != -1) {
//			System.out.println(stack[top]);
//			return stack[--top];
//		}else {
//			return -1;
//		}
//	}
//
//	//push X: 정수 X를 스택에 넣는 연산이다.
//	public void push(int item) {
//		stack[top++] = item;
//	}
//
//	//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//	public int empty() {
//		if(top != -1) {
//			return 0;
//		}else {
//			return 1;
//		}
//	}
//
//	//top: 스택의 가장 위에 있는 정수를 출력한다. 
//	//만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	public int top() {
//		if(top != -1) {
//			return stack[top];
//		}else {
//			return -1;
//		}
//	}
//}

public class algo_10828{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int order_size = sc.nextInt();
		int[] stack = new int[order_size];
		int top = -1;
		String order;
		
		for(int i = 0; i<=order_size; i++) {
			order = sc.next();
			if(order.equals("push")) {
				top++;
				stack[top] = sc.nextInt();
			}else if(order == "pop") {
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(stack[top]);
					top--;
				}
			}else if(order.equals("empty")) {
				if(top == -1) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(order.equals("size")) {
				//size = number of elements a stack contains at present
				//capacity = number of elements it is capable of holding
				//int 배열로 선언했기 때문에 top에 +1
				System.out.println(top+1);
			}else if(order.equals("top")) {
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(stack[top]);
				}
			}else {
				System.out.println("입력할 수 없는 명령어입니다.");
			}
		}
	}
}
