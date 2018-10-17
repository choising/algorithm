package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComingUpStair2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		if(arr.length == 2) {
			return arr[0]+arr[1];
		}
		
		int[] d = new int[arr.length];
		d[0] = arr[0];
		d[1] = arr[0] + arr[1];
		d[2] = Math.max(d[0] + arr[2], arr[1] + arr[2]);
		for(int i = 3; i < arr.length; i++) {
			d[i] = Math.max(d[i-2] + arr[i], d[i-3] + arr[i-1] + arr[i]);
		}
		return d[arr.length-1];
	}

}
