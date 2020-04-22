package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo_10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Integer> queue = new LinkedList<>();

		int order_size = sc.nextInt();
		int value = 0; //why
		String order;

		for(int i = 0; i < order_size; i++) {
			order = sc.next();

			if(order.equals("push")) {
				value = sc.nextInt();
				queue.add(value);
			}else {
				switch(order) {
				case "pop" :
					if(queue.isEmpty()) {
						System.out.println(-1);
					}else {
						System.out.println(queue.poll());
					}
					break;
				case "size" :
					System.out.println(queue.size());
					break;
				case "empty" :
					if(queue.isEmpty()) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					break;
				case "front" :
//					if(queue.isEmpty()) {
//						System.out.println(-1);
//					}else {
//						System.out.println(queue.peek());
//					}
					if(!queue.isEmpty())
                        System.out.println(queue.peek());
                    else 
                        System.out.println("-1");
                    break;
				case "back" : 
//					if(queue.isEmpty()) {
//						System.out.println(-1);
//					}else {
//						System.out.println(value);
//					}
//					break;
					if(!queue.isEmpty())
                        System.out.println(value);
                    else 
                        System.out.println("-1");
                    break;
				}
			}
		}
	}
}

//class queue{
//	int front;
//	int rear;
//	int[] queue;
//	int size;
//	
//	//size: 큐에 들어있는 정수의 개수를 출력한다.
//	public queue(int size) {
//		front = 0;
//		rear = -1;
//		this.size= size;
//		queue = new int[size];
//		
//		System.out.println(size);
//	}
//	
//	//push X: 정수 X를 큐에 넣는 연산이다.
//	public void enQueue(int item) {
//		rear++;
//		queue[rear] = item;
//	}
//	
//	//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 
//	//만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	public int deQueue() {
//		if(front == rear + 1) {
//			//다시구현
//			return front;
//		}else {
//			return -1;
//		}
//	}
//	
//	//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//	public boolean isEmpty() {
//		if(front == rear + 1) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	//front: 큐의 가장 앞에 있는 정수를 출력한다. 
//	//만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	
//	//back: 큐의 가장 뒤에 있는 정수를 출력한다. 
//	//만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//}
