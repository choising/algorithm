package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DontStudyAbroad2789 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String c = "CAMBRIDGE";
		
		for (int i = 0; i < c.length(); i++) {
			String a = c.substring(i, i+1);
			s = s.replaceAll(a, "");
		}
		
		System.out.println(s);
	}

}
