/*자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]*/
package level1;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumberArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumberArray rna = new ReverseNumberArray();
		System.out.println(rna.solution(12345)[0]);
		
	}
	
	public int[] solution(long n) {
		int[] answer = {};
		String s = Long.toString(n);
		answer = new int[s.length()];
		int cnt = 0;
		while(n > 0) {
			answer[cnt] = (int)(n % 10);
			n = n / 10;
			cnt++;			
		}
		return answer;
/*		int[] answer = {};
		List<String> list = new ArrayList<>();
		String[] answerString = Long.toString(n).split("");
		list = Arrays.asList(answerString);
		Collections.reverse(list);
		answer = list.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
	    return answer;*/
	}

}
