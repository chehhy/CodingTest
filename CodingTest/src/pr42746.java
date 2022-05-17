

import java.util.Arrays;
import java.util.Collections;

//가장 큰 수
public class pr42746 {

		public String solution(int[] numbers) {
			String answer = "";

			Arrays.sort(numbers, Collections.reverseOrder()); // numbers 내림차순 정렬    
			
			String[] str = new String[numbers.length]; // numbers를 string으로 저장할 str배열

			for (int i = 0; i < str.length; i++) { // string으로 형변환
				str[i] = String.valueOf(numbers[i]);
			}
			
			for(String arr : str) // 문자열 연결하기
	            answer += arr;
			
			return answer;

	}
}

// 단순히 내림차순 하면 안됨. 31, 9 같은 경우가 있기 때문