package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change5585 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int change = 1000 - n;
		int answer = 0;
		int[] arr = new int[6];
		arr[0] = 500;
		arr[1] = 100;
		arr[2] = 50;
		arr[3] = 10;
		arr[4] = 5;
		arr[5] = 1;
			
		while(change > 0) {
			for(int i = 0; i < 6; i++) {
				if(change >= arr[i]) {
					answer += 1;
					change -= arr[i];
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
