package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFraction1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int line = 1;
		for (int i = 1; i <= n; i++) {
			if((i * (i+1)) / 2 >= n) {
				line = i;
				break;
			}
		}
		
		int min = (line * (line - 1)) / 2;
		min += 1;
		
		int diff = n - min;
		int bot = line - diff;
		int top = 1 + diff;
		
		String s = line % 2 == 0 ? (top + "/" + bot) : (bot + "/" + top);
		System.out.println(s);
		
	}

}
