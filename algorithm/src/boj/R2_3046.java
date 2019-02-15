package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R2_3046 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		System.out.println((r * 2) - a);
		
	}

}
