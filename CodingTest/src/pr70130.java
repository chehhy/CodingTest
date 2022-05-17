

// 스타 수열
public class pr70130 {
	
	    public int solution(int[] a) {
	    	
	        int[] count = new int[a.length];
	        for(int num : a) count[num]++; // 각 숫자의 갯수를 셈 
	        
	        int ret = 0; // 현재까지의 최대 교집합 갯수
	        
	        for(int i=0 ; i<a.length ; i++) {
	        	
	        	if(count[i]==0) continue; // 갯수가 0인 숫자는 고려하지 않아도 됨
	        	if(count[i]<=ret) continue; // 현재까지의 최대 교집합 수보다 작으면 고려하지 않아도 됨
	        	
	        	int len = 0; // i로 가질 수 있는 교집합 갯수
	        	
	        	for(int j=0 ; j<a.length-1 ; j++) {
	        		
	        		if(a[j]!=i && a[j+1]!=i) continue; // 교집합에 해당하는 원소가 없으면 continue
	        		if(a[j]==a[j+1]) continue; // 두 수가 같으면 continue
	        		len++; // 교집합 갯수 증가
	        		j++; // 집합이 만들어지면 두칸씩 넘어감
	        		
	        	}
	        	
	        	ret = Math.max(ret, len); // ret과 len을 비교해 큰 것을 저장
	        	
	        }
	        
	        return ret*2; // 총길이 
	    }
}