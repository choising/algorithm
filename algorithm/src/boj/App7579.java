package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App7579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken());
		
		int[] sizes = new int[n];
		int[] costs = new int[n];
		
		st = new StringTokenizer(br.readLine());
		int sizeSum = 0;
		for(int i = 0; i < n; i++) {
			sizes[i] = Integer.parseInt(st.nextToken());
			sizeSum += sizes[i];
		}
		
		st = new StringTokenizer(br.readLine());
		int max = 0;
		for(int i = 0; i < n; i++) {
			costs[i] = Integer.parseInt(st.nextToken());
			max += costs[i];
		}
		
		int[] d = new int[max+1];	// index = cost, value = max memory

		d[max] = sizeSum;
		for(int i = 0; i < n; i++) {
			for(int j = max; j >= costs[i]; j--) {
				d[j] = Math.max(d[j], d[j - costs[i]] + sizes[i]);
			}
		}
		
		for(int i = 0; i < max; i++) {
			if(d[i] >= size) {
				System.out.println(i);
				break;
			}
		}
		
	}	
}
