package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM13241 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long gcm = b > a? gcm(a, b) : gcm(b, a);
		long answer = (a * b) / gcm;
		System.out.println(answer);
		
	}
	
	static long gcm(long a, long b) {
		if(a == 0) {
			return b;
		}
		return gcm(b % a, a);
	}

}
