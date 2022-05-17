

import java.util.HashMap;
import java.util.Map;

// 전화번호 목록
public class pr42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> hm = new HashMap<>();

        for (String phoneNumber : phone_book) { // 전화번호 해쉬맵에 넣기
        	hm.put(phoneNumber, 0);
        }
        
        for (String phoneNumber : phone_book) { // 전화번호를 돌면서
        	for(int i = 1; i<phoneNumber.length() ; i++) { 
        		
        		String temp = phoneNumber.substring(0,i); // 그 전화번호의 접두어자체가 전화번호인 경우를 찾기 
        		
            	if (hm.containsKey(temp)) { // 그런 번호가 있으면 answer가 false
            		answer = false;
            	}
            	
        	}
        }
        
        return answer;
    }
}

//테이블에 다 넣고,
//하나씩 돌면서, contain 하고 있는게 있는지

//////////////해시테이블 메소드 https://www.geeksforgeeks.org/hashtable-in-java/