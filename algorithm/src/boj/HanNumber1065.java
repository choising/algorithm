/*문제
어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

예제 입력 1 
110
예제 출력 1 
99
*/
package boj;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class HanNumber1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
		sc.close();
	}
	
	public static int solution(int n) {
		if(n < 100) return n;
		
		int cnt = 99;
		for(int i = 100; i <= n; i++) {
			int a = i / 100;
			int b = (i%100)/10;
			int c = i % 10;
			if(2*b == a + c) cnt++;
		}
		return cnt;
	}
	
	@Test
	public void solutionTest() {
		int n = 110;
		Assert.assertEquals(solution(n), 99);
	}

}
