/*가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
abcde	c
qwer	we
*/
package level1;

import java.util.Scanner;

public class CenterCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CenterCharacter cc = new CenterCharacter();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(cc.solution(s));
		sc.close();
	}
	
	public String solution(String s) {
		String answer = "";
		String[] str = {};
		str = s.split("");
		if(s.length() == 1) {
			answer = s;
		}
		else if(s.length() % 2 == 1) {
			//홀수
			int key = 0;
			key = (int)(s.length()/2);
			answer = str[key];
		}
		else {
			int key = 0;
			key = (int)(s.length()/2);
			answer = str[key-1] + str[key];
		}
		
		return answer;
	}
}
