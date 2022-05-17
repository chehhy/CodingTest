

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 숫자판 점프
public class bj2210 { // dx, dy 배열 이용해서 한칸씩 이동하는 모든 경우의 수를 돌아보려고 함

	static int[] dx = { -1, 1, 0, 0 }; // x축 이동
	static int[] dy = { 0, 0, -1, 1 }; // y축 이동
	public static int[][] arr; // 숫자판
	static List<String> list = new ArrayList<String>(); // 6자리의 수들을 저장할 배열

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		arr = new int[5][5];

		// dfs 돌려서 6자리숫자 완성하기

		System.out.println(list.size());

		/*
		 * public static void dfs() {
		 * 
		 * for(int i = 0 ; i < 4 ; i ++) { 
		 * int aaaax = x + dx[i]; 
		 * int aaaay = y + dy[i]; // 경우의 수 만들기가 어려움... 
		 * }
		 */
	}
}
