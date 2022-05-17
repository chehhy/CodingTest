

import java.util.Scanner;
import java.util.Stack;

// 괄호
public class bj9012 {
	public static void main(String[] args) {

		String s = solution();
		System.out.println(s);
	}

	private static String solution() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // PS가 몇갠지 입력받음

		String[] ps = new String[n]; // n 크기의 배열 선언

		for (int i = 0; i < n; i++) { // PS 입력받기
			ps[i] = sc.next();
		}

		for (int i = 0; i < n; i++) { // PS마다 검사하기
			//if (ps[i].length/2 == 1) // 괄호 갯수가 홀수면 VPS 아님
			//	return "NO";
			
			Stack<String> stack = new Stack<>();
			for (int j = 0; i< arr.length; j++) {
				if (ps[i].toCharArray(j) == "(") { // 여는 괄호일 때 스택에 push
					stack.push(arr[i][j]);
				}
				else { // 닫는 괄호일 때
					String p = stack.pop();
					if (p == "(") // p가 여는 괄호면 VPS 조건 만족
						continue;
					else // 여는 괄호가 아니면 VPS 아님
						return "NO";
				}
				return "YES";
			}
		}
	}
}