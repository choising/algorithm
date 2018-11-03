package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrinkWine2156 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
	static int solution(int n) throws NumberFormatException, IOException {
		int[] d = new int[n+1];
		int preWine = 0;
		int curWine = 0;
		d[0] = 0;
		
		curWine = Integer.parseInt(br.readLine());
		d[1] = curWine;
		preWine = curWine;
		if(n == 1) return d[1];
		
		curWine = Integer.parseInt(br.readLine());
		d[2] = d[1] + curWine;
		preWine = curWine;
		if(n == 2) return d[2];
		
		for(int i = 3; i < n+1; i++) {
			curWine = Integer.parseInt(br.readLine());
			d[i] = Math.max(Math.max(d[i-3] + preWine + curWine, d[i-1]), d[i-2] + curWine);
			preWine = curWine;
		}
		
		return d[n];
	}

}
