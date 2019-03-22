package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindMultiple4504 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while (m != 0) {			
			if(go(n, m)){
				sb.append(m)
				.append(" is a multiple of ")
				.append(n)
				.append(".")
				.append(System.lineSeparator());
			}
			else {
				sb.append(m)
				.append(" is NOT a multiple of ")
				.append(n)
				.append(".")
				.append(System.lineSeparator());
			}
			
			m = Integer.parseInt(br.readLine());
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}

	private static boolean go(int n, int m) {
		if(m < n) 
			return false;
			
		if(m % n == 0)
			return true;
	
		return false;
	}

}
