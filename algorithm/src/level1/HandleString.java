/*문자열 다루기 기본
문제 설명
문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s	return
a234	false
1234	true*/
package level1;

import java.util.Scanner;

public class HandleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HandleString hs = new HandleString();
		System.out.println(hs.solution(s));
		sc.close();
	}
	
	public boolean solution(String s) {
	    boolean answer = true;
	    String pattern = "^[0-9]{4}|[0-9]{6}$";
	    answer = s.matches(pattern);
	    return answer;
	}

}
