

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

// 에디터
public class bj1406 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 문자열 입력받기
		String str = bf.readLine();
		// 명령어 개수
		int n = Integer.parseInt(bf.readLine());
		
		List<Character> list = new LinkedList<>(); // 문자열 저장할 리스트
		
		// 문자열 저장
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		int size = list.size(); // 문자열 길이
		int index = list.size(); // (커서)
		
		
		while (n-- > 0) { // 명령어 갯수만큼 실행
			String[] line = bf.readLine().split(" "); // 명령어 입력받기
			// 커서 왼쪽 한칸 이동
			if (line[0].equals("L")) {
					index -= 1;
			}
			// 커서 오른쪽 한칸 이동
			else if (line[0].equals("D")) {
				index += 1;
			}
			// 커서 왼쪽 문자 삭제
			else if (line[0].equals("B")) {
				list.remove(index);
			}
			// 문자를 커서 왼쪽에 추가
			else if (line[0].equals("P")) {
				if (index >= size) { // 커서가 가장 오른쪽에 있을 때
					list.add(index, line[1].charAt(0));
				} else {
					list.add(index + 1, line[1].charAt(0));
				}
			}
		}
		System.out.println(list.toString()); // 완성된 문자열 출력
	}
}

// 연결리스트로 해결하려다가 