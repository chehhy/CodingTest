

import java.util.*;

// DFS와 BFS
public class bj1260 {
	
	public static int[][] arr; // 인접 관계를 나타낼 2차원 배열
	public static boolean[] visited; // 방문여부를 저장할 배열

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		int n = scan.nextInt(); // 정점의 개수 
		int m = scan.nextInt(); // 간선의 개수 
		int v = scan.nextInt(); // 시작할 정점의 번호 
		
		arr = new int[n+1][n+1]; // 인접 관계를 나타낼 2차원 배열 (정점의 개수에 맞게 표 만들기)
		
		for(int i=1 ; i<=m ; i++) {
			int a = scan.nextInt(); // 간선이 연결하는 두 정점의 번호
			int b = scan.nextInt(); // 간선이 연결하는 두 정점의 번호
			arr[a][b] = 1; // 인접 관계면 1 저장
			arr[b][a] = 1; // 인접 관계면 1 저장
		}
		
        // DFS
		visited = new boolean[n+1];
		for(int i=1 ; i<visited.length; i++) { // 방문여부 false로 초기화
			visited[i] = false;
		}
		
		dfs(v); 
		System.out.println();
        
        // BFS
		for(int i=1 ; i<visited.length; i++) { // 방문여부 false로 초기화
			visited[i] = false;
		}

		bfs(v);

		
	}
	
	public static void dfs(int start) {
		visited[start] = true; // 노드 방문 처리
		System.out.print(start+ " "); // 출력

		for(int i=1 ; i<arr.length ; i++) {
			if(i != start && arr[start][i] == 1 && visited[i] == false) { // 현재 노드와 다르고, 간선이 존재하고, 미방문 상태인 노드일 때
				dfs(i); // 재귀적으로 dfs
			}
		}
			
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>(); // 큐를 이용해 bfs
		
		queue.add(start); // 시작노드를 큐에 추가
		visited[start] = true; // 방문 처리
 		System.out.print(start+ " "); // 출력
		
		while(!queue.isEmpty()) {
			
			int num = queue.poll(); // 큐에서 빼낸 숫자 num에 저장
			
			for(int i=1 ; i<arr.length ; i++) {
				if(i != num && arr[num][i] ==1 && visited[i] == false) { // 현재 노드와 다르고, 간선이 존재하고, 미방문 상태인 노드일 때
					queue.add(i); // 노드를 큐에 추가
					visited[i] = true; // 방문 처리
					System.out.print(i+ " "); // 출력
				}
			}
		}
	}
	
	
	
}