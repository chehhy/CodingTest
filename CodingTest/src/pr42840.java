

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 모의고사
public class pr42840 {

	public int[] solution(int[] answers) {
		
		// 수포자 1,2,3의 답안
		int[] student1 = {1, 2, 3, 4, 5};
		int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		// 맞은 개수
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		// 맞은 개수 계산
		for (int i = 0 ; i < answers.length ; i++) {
			if(student1[i%5] == answers[i])
				cnt1++;
			if(student2[i%8] == answers[i])
				cnt2++;
			if(student3[i%10] == answers[i])
				cnt3++;
		}
		
		// 제일 많이 맞은 사람 찾기
		int max = Math.max(cnt1, Math.max(cnt2, cnt3));
		
		// 많이 맞은 사람을 리스트에 저장
		List<Integer> list = new ArrayList<>();
		if(max == cnt1)
			list.add(1);
		if(max == cnt2)
			list.add(2);
		if(max == cnt3)
			list.add(3);
		
		// 동점자가 발생한 경우 오름차순 정렬
		if(list.size()>1)
			Collections.sort(list);
		
		// 가장 많이 맞은 사람의 번호를 answer에 저장
		int[] answer = new int[list.size()];
		for(int i=0 ; i<list.size(); i++) { 
			answer[i] = list.get(i);
		}
		
		return answers;
	}
}