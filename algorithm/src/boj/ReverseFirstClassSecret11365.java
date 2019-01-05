package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseFirstClassSecret11365 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		while(!s.equals("END")) {
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			System.out.println(sb.reverse().toString());
			s = br.readLine();
		}
	}

}
