package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseAdd1357 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		System.out.println(reverse(reverse(x) + reverse(y)));
	}

	static int reverse(int n) {
		int answer = 0;
		while(n != 0) {
			answer *= 10;
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}
}
