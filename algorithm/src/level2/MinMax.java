/*최댓값과 최솟값
문제 설명
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
입출력 예
s	return
1 2 3 4	1 4
-1 -2 -3 -4	-4 -1
-1 -1	-1 -1*/
package level2;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMax mm = new MinMax();
		System.out.println(mm.solution("1 2 3 4"));
	}

	public String solution(String s) {
	    String answer = "";
	    String[] strArr = {};
	    int min = 0;
	    int max = 0;
	    strArr = s.split(" ");
	    
	    int[] numArr = new int[strArr.length];
	    
	    for(int i = 0; i < strArr.length; i++) {
	    	numArr[i] = Integer.parseInt(strArr[i]);
	    }
	    
	    min = numArr[0];
	    max = numArr[0];
	    
	    for(int i = 1; i< numArr.length; i++) {
	    	if(numArr[i] < min) {
	    		min = numArr[i];
	    	}
	    	if(numArr[i] > max) {
	    		max = numArr[i];
	    	}
	    }
	    
	    answer = min + " " + max;
	    
	    
	    return answer;
	}
}
