package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeejuInMathTest8974 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] arr = new int[10000];
		arr[0] = 0;
		int count = 1;
		int num = 1;
		while(count <= 1000) {
			for(int i = 0; i < num; i++) {
				arr[count] = num;
				count++;
			}
			num++;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for(int i = n; i <= m; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
