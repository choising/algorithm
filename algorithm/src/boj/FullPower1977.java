package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FullPower1977 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		
		int sum = 0;
		int min = 0;
		
		for(int i = 0; i * i <= m; i++) {
			if(i*i >= n) {
				sum += i*i;
				if(min == 0) min = i*i;
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
		
		
		
	}

}
