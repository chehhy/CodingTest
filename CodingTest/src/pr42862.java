

import java.util.ArrayList;

// 체육복
public class pr42862 {
	public int solution(int n, int[] lost, int[] reserve) {

		// lost배열을 lostList에 넣어줌
		ArrayList<Integer> lostList = new ArrayList<>();
		for (int e : lost) {
			lostList.add(e);
		}
		
		for (int i = 0; i < reserve.length; i++) { // reserve 값들을 하나씩 돌면서
			
			if (lostList.contains(Integer.valueOf(reserve[i] - 1))) { // lost에 reserve 값의 -1(앞번호)가 있으면
				lostList.remove(Integer.valueOf(reserve[i] - 1)); // 빌릴수 있으니 lost에서 삭제
				continue; // 빌려줬으니 continue
			}

			if (lostList.contains(Integer.valueOf(reserve[i] + 1))) { // lost에 reserve 값의 +1(뒷번호)가 있으면
				lostList.remove(Integer.valueOf(reserve[i] + 1)); // 빌릴수 있으니 lost에서 삭제
			}

		}
		
		int answer = n - lostList.size(); // 전체 학생 - 체육복을 못빌린 사람
		
		return answer;
	}

}

// n=5 lost [2,4] reserve [1,3,5] 