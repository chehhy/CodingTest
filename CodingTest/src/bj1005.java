

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// ACM Craft
public class bj1005 {

    static List<Integer>[] list;
    static int n, k; // n : 건물의 수 k : 건물이 지어지는 조건의 수 
    static int[] time; // 각 건물이 지어지는 시간
    static int[] degree; // 각 건물에 도착하는 방법의 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s1 = br.readLine().split(" ");
            n = Integer.parseInt(s1[0]);
            k = Integer.parseInt(s1[1]);
            time = new int[n + 1]; // 건물 번호는 1부터 시작하기 때문에 n+1
            degree = new int[n + 1];
            list = new ArrayList[n+1]; // 각 건물에서 출발해서 도착할 수 있는 건물 번호들
            String[] s3 = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                time[j] = Integer.parseInt(s3[j - 1]);
                list[j] = new ArrayList<>();
            }
            for (int j = 0; j < k; j++) { // x->y
                String[] s2 = br.readLine().split(" ");
                int x = Integer.parseInt(s2[0]); 
                int y = Integer.parseInt(s2[1]);
                list[x].add(y); // 도착할 수 있는 건물 번호 저장
                degree[y]++; // 먼저 지어져야 하는 건물 수
            }
            int w = Integer.parseInt(br.readLine()); // 건설해야할 건물의 번호 

            solution(w);
        }
    }

    public static void solution(int target){
        Queue<Integer> queue = new ArrayDeque<>();
        int [] result = new int[n+1]; // 건물을 지을때 까지의 최종 비용
        for(int i=1; i<=n; i++){
            result[i]=time[i]; // 일단 처음에는 time을 저장
            if (degree[i]==0){ // 제일 처음에 지어져야 하는 건물을 큐에 넣음
                queue.add(i);
            }
        }

        while (!queue.isEmpty()){ // 제일 처음 건물 이후
            int poll = queue.poll(); // 먼저 지어지는 건물 번호 큐에서 빼냄
            for(Integer next: list[poll]){ // 도착할 수 있는 건물 번호를 next에 저장
                result[next]= Math.max(result[next],result[poll]+time[next]); // 방금전 지은 건물을 필요로 하는 건물들의 리스트 이므로
                degree[next]--;                                               // 전 건물을 지은 시간중에 가장 큰 값을 찾아 넣어준다.
                if(degree[next]==0){  // 건물의 조건을 만족시켰다면 큐에 넣어준다. 
                    queue.add(next);
                }
            }
        }
        System.out.println(result[target]);
    }
}