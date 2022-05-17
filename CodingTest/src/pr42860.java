

// 조이스틱
public class pr42860 {
	    public int solution(String name) {
	        int answer = 0;
	        
	        // 상하 이동 횟수 세기
	        for(int i=0 ; i<name.length() ; i++){
	        	// N을 기점으로 아래로 갈지 위로 갈지가 나뉘므로
	            // A~N 일 때
	            if(name.charAt(i) <= 'N'){ 
	                answer = answer + name.charAt(i) -'A'; // 이동횟수 answer에 더해줌
	            }
	            // O~Z 일 때
	            else{ 
	                answer = answer + 'Z' - name.charAt(i) + 1; // 이동횟수 answer에 더해줌
	            }
	        }
	        
	        // 좌우 이동 횟수 세기 (A가 아닐때만 세면되나??)
	        for(int i=0 ; i<name.length() ; i++){
	        	if(name.charAt(i) != 'A')
	        		; // 모르겠다
	        }
	        
	        return answer;
	    }
}

// 상하, 좌우 이동 횟수는 각각 세도 될듯
// 알파벳 바꿀때, 위로 가는게 빠를지 아래로 가는게 빠를지 생각해야함
// 커서 바꿀때, 왼쪽으로 가는게 빠를지 오른쪽으로 가는게 빠를지 생각해야함 (문자열 길이를 2로 나누어서 ..? 중간에 A가 있는 경우는?)