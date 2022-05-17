

import java.util.Arrays;

// H-Index
public class pr42747 {
	// 아무리 많이 인용이 되었더라도 논문의 수가 2이면 h-index는 2 -> h-index는 논문의수 또는 논문의수 이하
	
	public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations); // citations 오름차순 정렬
        
        for(int i=0 ; i<citations.length ; i++) {
        	int h = citations.length - i; // h-index의 가능한 최댓값은 citations.length(논문의 수)이므로 
        	if(h <= citations[i]) {
        		answer = h;
        		break; // 더 해볼 필요 없는 이유 : 이미 오름차순 정렬을 해놨기 때문에 
        	}
        }  
        
        return answer;
    }
}

