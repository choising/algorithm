package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouJinNumber1356 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(go(s) ? "YES" : "NO");
	}
	
	static long gogo(String s) {
		long answer = 1;
		for(char c : s.toCharArray()) {
			answer *= (c-48);
		}
		return answer;
	}
	
	static boolean go(String s) {		
		for(int i = 1; i < s.length(); i++) {
			String s1 = s.substring(0, i);
			String s2 = s.substring(i, s.length());
			if(gogo(s1) == gogo(s2)) return true;
		}
		return false;
	}

}
