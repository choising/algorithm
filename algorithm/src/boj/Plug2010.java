package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plug2010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int answer = 1;
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			answer -= 1;
			answer += n;
		}
		
		System.out.println(answer);
	}

}
