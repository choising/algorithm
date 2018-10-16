package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RGBDistance1149 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] origin = new int[n][3];
		int[] answer = new int[3];
		
		for(int i = 0; i < n; i++) {
			String[] arr = br.readLine().split(" ");
			int[] intArr = Arrays.stream(arr).mapToInt(s -> Integer.parseInt(s)).toArray();
			origin[i] = intArr;
		}
		
		answer = origin[0];
		
		for(int i = 1; i < n; i++) {
			int temp0 = origin[i][0] + Math.min(answer[1], answer[2]);
			int temp1 = origin[i][1] + Math.min(answer[0], answer[2]);
			int temp2 = origin[i][2] + Math.min(answer[0], answer[1]);
			answer[0] = temp0;
			answer[1] = temp1;
			answer[2] = temp2;
		}
		System.out.println(Math.min(Math.min(answer[0], answer[1]), answer[2]));
	}

}
