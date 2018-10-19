package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Big7568{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			String[] sArr = br.readLine().split(" ");
			int[] iArr = Arrays.stream(sArr).mapToInt(s -> Integer.parseInt(s)).toArray();
			arr[i] = iArr;
		}
		
		for(int i = 0; i < arr.length; i++) {
			int count = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}
}
