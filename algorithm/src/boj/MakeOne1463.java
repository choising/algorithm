package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[n+1];
		d[1] = 0;
		
		for(int i = 2; i < n+1; i++) {
			d[i] = d[i-1] + 1;
			if(i%2 == 0 && d[i/2] + 1 < d[i]) {
				d[i] = d[i/2] + 1;
			}
			if(i%3 == 0 && d[i/3] + 1 < d[i]) {
				d[i] = d[i/3] + 1;
			}
		}
		System.out.println(d[n]);
	}
}
