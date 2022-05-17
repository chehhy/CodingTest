

import java.util.ArrayList;

// 큰 수 만들기
public class pr42883 {
	public String solution(String number, int k) {
        String answer = "";
        int front = 0; // 비교할 숫자 중 앞숫자 인덱스
        int back = 1; // 비교할 숫자 중 뒷숫자 인덱스
        
        // number를 numberArr 어레이리스트에 담아줌
        ArrayList<Character> numberArr = new ArrayList<Character>();
        char[] chArray = number.toCharArray();
        for (char c : chArray)
        	numberArr.add(c);      
        
        // 앞뒤숫자를 비교해서 작은 숫자를 remove 해주는 방식
        for (int i=0 ; i < k ; i++) { 
            
            if (numberArr.get(front) < numberArr.get(back)){ // 앞숫자가 뒷숫자보다 작으면
            	numberArr.remove(front); // 앞숫자 삭제
            	continue;
            }
            
            if (numberArr.get(front) > numberArr.get(back)){ // 뒷숫자가 앞숫자보다 작으면
            	numberArr.remove(back); // 뒷숫자 삭제
            	continue;
            }
            
            else { // 앞숫자와 뒷숫자가 같을 경우 검사할 인덱스 올려줌 (772 에서 77 비교하던걸 72 비교하도록)
                front++; 
                back++;
                k++; // 숫자 삭제가 안됐으니 반복문 한번더 실행해야함
            }
        }
       
        answer = numberArr.toString();
        
        return answer;
    }
}

// 같은 숫자가 없는 경우에는 제대로 동작하는데
// 같은 숫자가 나오는 경우에서 반례가 있음 