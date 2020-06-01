package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_11724 {
	private static int visit[];
    private static int [][]graph;
    private static int cnt, N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new int[N+1];
        graph = new int[N+1][N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }
        cnt=0;
        for (int i = 1; i <= N ; i++) { //i = 방문하는 노드 인덱스
            if(visit[i] == 0){
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }
}
