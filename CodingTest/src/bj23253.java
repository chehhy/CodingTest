

import java.util.Scanner;
import java.util.Stack;

// 자료구조는 정말 최고야
public class bj23253 {

	public static void main(String[] args) {

		String s = solution();
		System.out.println(s);
	}

	private static String solution() {
		Scanner sc = new Scanner(System.in);
		
		int n; // 교과서의 수
		int m; // 더미의 수
		
		int k; // 각 더미에 쌓인 교과서의 수 
		int numbering; // 교과서 번호
		
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for (int i=0 ; i<2*m ; i++) {
			k = sc.nextInt();
			
			for (int j=0 ; j<k ; j++) {
				Stack<String> stack = new Stack<>();
				numbering = sc.nextInt();
				// 스택에 푸쉬     (스택 몇개 만들지 필요 )
			}
		}
		
		
		
		
		
		
		
	
		return "YES";
	}
	
}
