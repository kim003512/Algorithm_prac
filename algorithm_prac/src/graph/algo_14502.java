package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
    this.y = y;
    }
}
public class algo_14502 {
    public static final int BLANK = 0;
    public static final int WALL = 1;
    public static final int VIRUS = 2;
    public static final int[] dx = {0,0,1,-1};
    public static final int[] dy = {1,-1,0,0};
	
    public static int n, m;
    public static int[][] inputAry;
    public static int[][] map;
    public static int answer = Integer.MIN_VALUE;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
		
        inputAry = new int[n][m];
        map = new int[n][m];
		
        for(int i = 0; i < n; i++)
            for(int j = 0 ; j < m; j++)
                inputAry[i][j] = map[i][j] = sc.nextInt();

		
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < m; j++) {
                if(inputAry[i][j] == BLANK) {
                    map[i][j] = WALL;
                    dfs(1);
                    map[i][j] = BLANK;
                }
            }
        }
        System.out.println(answer);
    }
    //벽 기둥 3개를 세우기 위한 함수
    public static void dfs(int cnt) {
        if(cnt == 3) {
            bfs();
            return;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < m; j++) {
                if(map[i][j] == BLANK) {
                    map[i][j] = WALL;
					dfs(cnt+1);
                    map[i][j] = BLANK;
                }
            }
        }
    }
    public static void bfs() {
        int[][] virusMap = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                virusMap[i][j] = map[i][j];

        Queue<Pair> q = new LinkedList<Pair>();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(virusMap[i][j] == VIRUS)
                    q.add(new Pair(i,j));

        while(!q.isEmpty()) {
            Pair p = q.remove();
            int x = p.x;
            int y = p.y;
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(virusMap[nx][ny] == BLANK) {
                        virusMap[nx][ny] = VIRUS;
                        q.add(new Pair(nx, ny));
                    }
                }
            }
        }
        calAnswer(virusMap);
    }

    public static void calAnswer(int[][] virusMap) {
        int cnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(virusMap[i][j] == BLANK)
                    ++cnt;

        answer = Math.max(cnt, answer);
    }
}
