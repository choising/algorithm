package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KMP2902 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String answer = "";
		while(st.hasMoreTokens()) {
			answer += st.nextToken("-").substring(0, 1);	
		}
		System.out.println(answer);
		
	}

}
