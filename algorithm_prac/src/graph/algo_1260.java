package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/11724
public class algo_1260 {
	private static int[][] graph; // @1
	private static boolean[] visit; // @2
	private static int n, m, v; // @3
	
	public static void dfs(int v1) { // @4
		visit[v1] = true;
		System.out.print(v1 + " ");
		
		for(int j=1; j<=n; j++) {
			if(graph[v1][j] == 1 && visit[j] == false) dfs(j);
		}
	}
	
	public static void bfs(int v1) { // @5
		Queue<Integer> Q = new LinkedList<Integer>();
		
		Q.offer(v1);
		visit[v1] = true;
		System.out.print(v1 + " ");
		
		int tmp;
		while(!Q.isEmpty()) {
			tmp = Q.poll();
			for(int j=1; j<n+1; j++) {
				if(graph[tmp][j] == 1 && visit[j] == false) {
					Q.offer(j);
					visit[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] setInput = br.readLine().split(" ");
		
		n = Integer.parseInt(setInput[0]);
		m = Integer.parseInt(setInput[1]);
		v = Integer.parseInt(setInput[2]);
		
		
		graph = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		while(m-- != 0) {
			setInput = br.readLine().split(" ");
			int x = Integer.parseInt(setInput[0]);
			int y = Integer.parseInt(setInput[1]);
			graph[x][y] = graph[y][x] = 1; // @6
		}
		
		dfs(v);
		for(int i=1; i<=n; i++) { // @7
			visit[i] = false;
		}
		System.out.println();
		bfs(v);
		
	}
}
