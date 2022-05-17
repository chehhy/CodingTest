

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

// 키로거
public class bj5397 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 테스트 케이스 개수
		int n = Integer.parseInt(bf.readLine());

		for (int count = 0; count < n; count++) {
			List<Character> list = new LinkedList<>(); // 문자열 저장할 리스트
		
			// 문자열 입력받기
			String str = bf.readLine();
		
		int index = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i).equals('-')) {
				if (index != 0) { 
					index -= 1;
					list.remove(index);
				}

			} else if (str.charAt(i).equals("<")) {
				if (index != 0) {
					index -= 1;
				}
			} else if (str.charAt(i).equals(">")) {
				if (index != 0) {
					index += 1;
				}
			} else {
                index++;
                list[index].add(str.charAt(i));
            }

		}
		
		System.out.println(list.toString()); // 완성된 문자열 출력
		}
	}

}