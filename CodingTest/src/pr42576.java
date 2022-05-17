

import java.util.Map;
import java.util.HashMap;

// 완주하지 못한 선수
public class pr42576 {
	public String solution(String[] participant, String[] completion) {
	    String answer = "";

	    Map<String, Integer> hm = new HashMap<>();
		
	    for (String p : participant) {
	        hm.put(p, hm.getOrDefault(p, 0) + 1); // 참여차를 map에 넣으면서 value는 1로 저장 (getOrDefault : 동명이인이 있으면 +1)
	    }

	    for (String c : completion) {
	        hm.put(c, hm.get(c) - 1); // completion을 돌면서 -1 해줌
	    }

	    for (String key : hm.keySet()) {
	        if (hm.get(key) != 0) { // 0이 아니면 완주하지 못한 사람임
	            answer = key;
	            break;
	        }
	    }

	    return answer;
	}
}


// participant 1 넣어줌
// completion 돌면서 -1 해줌
// 0이 아니면 return

// 동일인물 처리 - getOrDefault
// getOrDefault : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환
// ( 원래 저장되어있던 value를 이어서 쓰고 싶을 때 )
// ( 그니까 동일인물이 있으면 2로 만든다는 거 )


////////////// 해시테이블 메소드 https://www.geeksforgeeks.org/hashtable-in-java/