

// 타겟 넘버
public class pr43165 { // 모든 경우의 수를 돌아서 계산값이 target과 동일하다면 카운팅

	int answer = 0;
	public int solution(int[] numbers, int target) {
		dfs(numbers,target,0);
		return answer;
	}
	
	public void dfs(int[] numbers, int target, int node) {
		if (node == numbers.length) { // 배열의 마지막일 노드일 경우
			int sum = 0; // sum 초기화
			for(int i=0; i<numbers.length; i++) { // 배열에 있는 모든 수 더해서 sum에 저장
				sum += numbers[i];
			}
			if(target == sum) answer++; // 합이랑 target이 같다면 answer 증가
		}else {
			
			// 모든 경우의 수 검사하기 (어떻게할지 모르겠음..)
			dfs(numbers, target, node+1);
		
		}
	}
	
}