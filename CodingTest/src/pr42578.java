

import java.util.HashMap;
import java.util.Map;

// 위장
public class pr42578 {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> hm = new HashMap<>();
        
        for (String[] c : clothes) { 
        	String clothes_type = c[1]; // (2차원배열의 인덱스1번이 옷 종류니까)
        	hm.put(clothes_type, hm.getOrDefault(clothes_type, 0) + 1); // 종류마다의 옷 수를 세어줌
        }
        
        answer = 2^hm.size(); // 2^종류수
        
        
        for(String key : hm.keySet()) { // 키를 돌면서
        	answer *= 2^(hm.get(key)); // 2^종류안의옷수 * 2^종류안의옷수 * 2^종류안의옷수 * ...
        }
        

        return answer-1; // 모두 선택되지 않았을 경우를 제외하기 위해 -1
    }
}



//2^종류수 * 2^종류안의옷수 * 2^종류안의옷수 * ... -1(모두선택되지않았을때)



// 같은 종류의 옷끼리 체이닝하고 갯수를 세려고했는데 체인 갯수 세는 메소드는 없는거같음
// 그래서 생각해낸게
// 옷의 이름자체는 중요하지 않으니까 옷이 늘어날수록 value값만 늘려주기로 함 (getOrDefault 이용)












