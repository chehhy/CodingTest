

import java.util.Stack;

// 크레인 인형뽑기 게임
public class pr64061 {
	public static int solution(int[][] board, int[] moves) {
		
		int answer = 0; // 제거된 인형 수
		Stack<Integer> s = new Stack<Integer>(); // 인형을 넣을 스택
		
		// 인형 뽑아서 스택에 넣기
		for(int i=0 ; i<moves.length ; i++) {
			for(int j=0; j<board.length ; j++) { // board의 행값을 늘려가면서 뽑아야함
				
				// 해당하는 board 칸에 인형이 있을 경우
				if(board[j][moves[i]-1] != 0) { // moves 값을 board의 열값에 넣음. 배열 인덱스이므로 -1
					
					// 스택이 비어있을 경우 스택에 인형 넣기
					if(s.isEmpty()) 
						s.push(board[j][moves[i]-1]); 
					
					// 스택에 인형이 있을 경우
					else { 
						// 인형이 동일하면 제거 후 answer 2 증가
						if(s.peek() == board[j][moves[i]-1]) {
							s.pop();
							answer += 2;
						}
						// 인형이 동일하지 않으면 스택에 인형 넣기
						else {
							s.push(board[j][moves[i]-1]);
						}
					}
					
					// board에서 인형을 빼냈으므로 해당 칸을 0으로 저장
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		
		return answer;
	}
}
