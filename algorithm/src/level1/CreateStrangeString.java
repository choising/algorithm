/*이상한 문자 만들기
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
입출력 예
s	return
try hello world	TrY HeLlO WoRlD
입출력 예 설명
try hello world는 세 단어 try, hello, world로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다. 따라서 TrY HeLlO WoRlD 를 리턴합니다.*/
package level1;

public class CreateStrangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateStrangeString css = new CreateStrangeString();
		System.out.println(css.solution("  try   hello world  "));
	}

	public String solution(String s) {
	    String answer = "";
	    String[] wordArr = s.split(" ");
	    for(int i = 0; i < wordArr.length; i++) {
	    	String newWord = "";
	    	int cnt = 0;
	    	for(int j = 0; j < wordArr[i].length(); j++) {
	    		if(Character.isAlphabetic(wordArr[i].charAt(j))) {
	    			if(cnt % 2 == 0) {
	    				newWord += Character.toUpperCase(wordArr[i].charAt(j));
	    			}
	    			else {
	    				newWord += Character.toLowerCase(wordArr[i].charAt(j));
	    			}
	    			cnt++;
	    		}
	    	}
	    	wordArr[i] = newWord;
	    	if(i != wordArr.length -1) {
	    		answer += wordArr[i] + " ";	
	    	}
	    	else {
	    		answer += wordArr[i];
	    	}
	    }
	    int numberOfLastSpace = s.length() - answer.length();
    	for(int i = 0; i < numberOfLastSpace; i++) {
    		answer += " ";
    	}
	    return answer;
	}
}
