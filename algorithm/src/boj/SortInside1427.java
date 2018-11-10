package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortInside1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[10];
		
		while(n > 0) {
			int temp = n % 10;
			if(arr[temp] == null) arr[temp] = String.valueOf(temp);
			else arr[temp] += temp;
			n /= 10;
		}
		
		for(int i = 9; i >= 0; i--) {
			if(arr[i] != null) {
				System.out.print(arr[i]);
			}
		}
	}
}
