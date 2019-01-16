package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SumOfPartFour11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int size = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		int[] sum = new int[100001];
		st = new StringTokenizer(br.readLine());
		
		sum[0] = 0;
		sum[1] = Integer.parseInt(st.nextToken());
		for(int i = 2; i <= size; i++) {
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int temp = 0;
			if(x > y) {
				temp = y;
				y = x;
				x = temp;
			}
			sb.append(sum[y]-sum[x-1]).append(System.lineSeparator());
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
