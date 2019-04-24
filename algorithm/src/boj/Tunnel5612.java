package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tunnel5612 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int in = Integer.parseInt(br.readLine());
		int max = in;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			in += Integer.parseInt(st.nextToken());
			in -= Integer.parseInt(st.nextToken());
			if (in < 0) {
				max = 0;
				break;
			}
			if (max < in) max = in;
			
		}
		
		System.out.println(max);
	}

}
