package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Constant2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int a = 0;
		int b = 0;
		int answer;
		String s = "";
		char[] chars = strs[0].toCharArray();
		for(int i = chars.length-1; i >= 0; i--) {
			s += chars[i];
		}
		a = Integer.parseInt(s);
		s = "";
		
		char[] charss = strs[1].toCharArray();
		for(int i = charss.length-1; i >= 0; i--) {
			s += charss[i];
		}
		
		b = Integer.parseInt(s);
		
		answer = a > b ? a : b;
		System.out.println(answer);
	}

}
