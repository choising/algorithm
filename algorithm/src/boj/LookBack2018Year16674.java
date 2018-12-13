package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LookBack2018Year16674 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[9];
		
		for (char c : s.toCharArray()) {
			if(c == '0') {
				arr[0]++;
			} else if(c == '1') {
				arr[1]++;
			} else if(c == '2') {
				arr[2]++;
			} else if(c == '8') {
				arr[8]++;
			} else {
				arr[3]++;
			}
		}
		
		if(arr[3] == 0) {
			if(arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[8] != 0) {
				if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[8]) {
					//묶
					System.out.println("8");
				} else {
					//밀접
					System.out.println("2");
				}
			} else {
				// 관련
				System.out.println("1");
			}
		} else {
			System.out.println("0");
		}
	}

}
