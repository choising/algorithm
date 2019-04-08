package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bird1568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		int sub = 1;
		while (n != 0) {
			if (n - sub >= 0) {
				n -= sub;
				sub++;
				answer++;
			} else {
				sub = 1;
				n -= sub;
				sub++;
				answer++;
			}
		}
		System.out.println(answer);
	}
}
