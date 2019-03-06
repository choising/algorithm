package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalRoot6378 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		while(!s.equals("0")) {
			int answer = go(s);
			while(answer >= 10) {
				answer = go(answer);
			}
			System.out.println(answer);
			s = br.readLine();
		}
	}
	
	private static int go(String s) {
		int answer = 0;
		for(char c : s.toCharArray()) {
			answer += c - 48;
		}
		return answer;
	}
	
	private static int go(int n) {
		int answer = 0;
		while(n != 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}
}
