package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFollowUp1748 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long answer = 0;
		if(n < 10) {
			answer = n;
		}
		else if(n < 100) {
			answer += 9;
			answer += 2 * (n-9);
		}
		else if(n < 1000) {
			answer += 9;
			answer += 2 * 90;
			answer += 3 * (n-99);
		}
		else if(n < 10000) {
			answer += 9;
			answer += 2 * 90;
			answer += 3 * 900;
			answer += 4 * (n - 999);
		}
		else if(n < 100000) {
			answer += 9;
			answer += 2 * 90;
			answer += 3 * 900;
			answer += 4 * 9000;
			answer += 5 * (n - 9999);
		}
		else if(n < 1000000) {
			answer += 9;
			answer += 2 * 90;
			answer += 3 * 900;
			answer += 4 * 9000;
			answer += 5 * 90000;
			answer += 6 * (n - 99999);
		}
		else if(n < 10000000) {
			answer += 9;
			answer += 2 * 90;
			answer += 3 * 900;
			answer += 4 * 9000;
			answer += 5 * 90000;
			answer += 6 * 900000;
			answer += 7 * (n - 999999);
		}
		else if(n < 100000000) {
			answer += 9;
			answer += 2 * 90;
			answer += 3 * 900;
			answer += 4 * 9000;
			answer += 5 * 90000;
			answer += 6 * 900000;
			answer += 7 * 9000000;
			answer += 8 * (n - 9999999);
		}
		else {
			answer += 9;
			answer += 2 * 90;
			answer += 3 * 900;
			answer += 4 * 9000;
			answer += 5 * 90000;
			answer += 6 * 900000;
			answer += 7 * 9000000;
			answer += 8 * 90000000;
			answer += 9;
		}
		System.out.println(answer);
	}

}
