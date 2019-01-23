package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		go(n);		
	}
	
	public static void go(int n) {
		for(int i = 9; i > 0; i--) {
			if(n % i == 0) {
				int count = n / i;
				System.out.println(count);
				for(int j = 1; j < count; j++) {
					System.out.print(i + " ");
				}
				System.out.print(i);
				return;
			}
		}
	}

}
