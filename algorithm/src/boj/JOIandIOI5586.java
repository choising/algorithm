package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JOIandIOI5586 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int index = -1;
		int joi = 0;
		int ioi = 0;
		do {
			index = s.indexOf("JOI", index+1);
			joi++;
		} while(index != -1);
		
		index = -1;
		
		do {
			index = s.indexOf("IOI", index+1);
			ioi++;
		}
		while(index != -1);
		
		ioi-=1;
		joi-=1;
		
		System.out.println(joi);
		System.out.println(ioi);
	}

}
