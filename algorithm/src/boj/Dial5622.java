package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] chs = s.toCharArray();
		int sum = 0;
		for(char c : chs) {
			if(c < 68) sum+=3;
			else if(c < 71) sum+=4;
			else if(c < 74) sum+=5;
			else if(c < 77) sum+=6;
			else if(c < 80) sum+=7;
			else if(c < 84) sum+=8;
			else if(c < 87) sum+=9;
			else if(c < 91) sum+=10;
		}		
		System.out.println(sum);
		
	}
}
