

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 기능개발
public class pr42586 {
	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55, 85 };
		int[] speed = { 1, 30, 5, 1 };

		System.out.println(Arrays.toString(solution(progresses, speed)));
	}

	public static int[] solution(int[] progresses, int[] speeds) {

		int[] answer = {};

		Queue<Integer> queue = new LinkedList<>(); // 우선순위에 따른 작업기간을 넣을 큐

		while (queue.isEmpty() == false) { // 작업이 남아있으면 계속

		}
		return answer;
	}
}

/* 
result_array = [];
int day = 1; // 오늘이 작업 며칠째인지
int day_count = 0; // 오늘 작업 완료한 개수

while(queue.isEmpty() == false){ //작업이 남아있으면 계속 돌리기
    today = queue.peek; // 큐의 맨앞 값 확인
    
    if(100 <= today.x + (today.y * day)){  // 만약 완료된다면
        day_count++; // 작업 개수 증가
        queue.remove; // 이 작업 큐에서 제거
        continue;
    }
    
    if(day_count > 0 ){ // 오늘 완료된 작업이 있으면
        result_array.add(day_count); // 완료된 작업 개수 기록
        day_count = 0; // 오늘 작업 개수 초기화
    }
    
    day++; // 오늘 작업 끝났으니 day 증가
}

print(result_array);
}
}*/
