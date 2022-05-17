

import java.util.Arrays;

// k번째수
public class pr42748 { 
	
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length]; // 커맨드 갯수에 따라 answer 배열 생성
	        
	        for (int i=0; i<commands.length; i++) { // 커맨드마다 실행
	            int[] result = new int[commands[i][1] - (commands[i][0]-1)]; // i번째 숫자부터 j번째 숫자까지 자른 수를 저장할 result 배열 생성
	            
	            for (int j=0; j<result.length; j++) { // result 인덱스 0부터 채워넣기
	                result[j] = array[j + commands[i][0]-1]; // array의 i번째 숫자부터 j번째 숫자까지 result에 넣기
	            }
	            Arrays.sort(result); // result 배열 정렬
	            answer[i] = result[commands[i][2]-1]; // answer에 k번째 숫자를 넣어줌
	        }
	        
	        return answer;
	    }
}

// 라이브러리를 써도 되는지? 인덱스 정하는것 말고는 sort만 사용하면 돼서 