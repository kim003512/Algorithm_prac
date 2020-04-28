package src;

import java.util.*;
import java.io.*;

public class algo_11004_k{
	
 	static int k,n;
	public static int partition(int[] array, int left, int right) {
	    int mid = (left + right) / 2; 
	    swap(array, left, mid); 
	 
	    int pivot = array[left];
	    int i = left, j = right;
	 
	    while (i < j) {
	        while (pivot < array[j]) { 
	            j--;
	        }
	 
	        while (i < j && pivot >= array[i]) { 
	            i++;
	        }
	        swap(array, i, j); 
	    }
	
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

