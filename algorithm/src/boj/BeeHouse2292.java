package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHouse2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int distance = 1;
		int count = 1;
		for(int i = 1; i < n+1; i++) {
			count--;
			if(count == 0 && i != n) {
				count = distance * 6;
				distance++;
			}			
			
		}
		System.out.println(distance);
	}
}
