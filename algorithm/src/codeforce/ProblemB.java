package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s = new StringBuilder(br.readLine());
		int count = 0;
		if(go(s, count) % 2 == 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
	
	public static int go(StringBuilder s, int count) {		
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)) {				
				s.replace(i-1, i+1, "");
				return go(s, count+1);
			}
		}
		return count;
	}

}
