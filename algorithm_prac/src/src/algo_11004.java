package src;

import java.util.*;
import java.io.*;

public class algo_11004{
	
 	static int k,n;
	public static int partition(int[] array, int left, int right) {
	    int mid = (left + right) / 2; 
	    swap(array, left, mid); // 중앙 값을 첫 번째 요소로 이동
	 
	    int pivot = array[left];
	    int i = left, j = right;
	 
	    while (i < j) {
	        while (pivot < array[j]) { // j는 오른쪽에서 왼쪽으로 피봇보다 작거나 같은 값을 찾는다.
	            j--;
	        }
	 
	        while (i < j && pivot >= array[i]) { // i는 왼쪽에서 오른쪽으로 피봇보다 큰 값을 찾는다.
	            i++;
	        }
	        swap(array, i, j); // 찾은 i와 j를 교환
	    }
	    // 반복문을 벗어난 경우는 i와 j가 만난경우
	    // 피봇과 교환
	    array[left] = array[i];
	    array[i] = pivot;
	    return i;
	}
	 
	public static void swap(int[] array, int a, int b) {
	    int temp = array[b];
	    array[b] = array[a];
	    array[a] = temp;
	}
	 
	public static void quicksort(int[] array, int left, int right) {
	    if (left >= right) {
	        return;
	    }
	 
	    int pi = partition(array, left, right);
	    
	   // partition과정을 통해 구한 구분점에 +1한 값과 k를 비교하여 해당하는 부분집합에 대해
       // 재귀호출을 반복한다.
	    if(pi+1 == k) return;
	    else if(pi+1<k)
	    	quicksort(array, pi + 1, right);
	    else
	    	quicksort(array, left, pi - 1);
	    
	}


	
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 
		 n =Integer.parseInt(st.nextToken());
		 k = Integer.parseInt(st.nextToken());
		 int arr[] = new int[n];
		 
		 st = new StringTokenizer(br.readLine());
		 for(int i=0;i<n;i++) {
			 arr[i] = Integer.parseInt(st.nextToken());
			 
		 }
		 
		 quicksort(arr,0,n-1);
	       
		 System.out.println(arr[k-1]);
	     
		
			
	       
	}
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class algo_11004 {
//    public static void main(String[] ar) throws Exception{
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String[] temp = in.readLine().split(" ");
//        int n = Integer.parseInt(temp[0]);
//        int k = Integer.parseInt(temp[1]);
//
//        StringTokenizer st = new StringTokenizer(in.readLine());
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
//        Arrays.sort(arr);
//        System.out.print(arr[k-1]);
//    }
//}

