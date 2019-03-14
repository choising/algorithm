package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteCell1100 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int count = 0;
		for(int i = 0; i < 8; i++) {
			String s = br.readLine();
			String[] arr = s.split("");
			if(i % 2 == 0) {
				for(int j = 0; j < 8; j += 2) {
					if(arr[j].equals("F")) count++;
				}	
			}
			else {
				for(int j = 1; j < 8; j += 2) {
					if(arr[j].equals("F")) count++;
				}
			}
		}
		System.out.println(count);
	}

}
