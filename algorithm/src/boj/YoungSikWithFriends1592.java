package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YoungSikWithFriends1592 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		int count = 0;
		int isM = 0;
		int catched = 1;
		while (isM != m) {
			arr[catched]++;			
			count++;
			isM = arr[catched];
			if (isM % 2 == 1) {
				catched = catched + l > n ? (catched + l) % n : catched + l;
			} else {
				catched = catched - l < 1 ? (catched - l) + n : catched - l;
			}
		}
		
		System.out.println(count > 0 ? count - 1 : count);
		
	}

}
