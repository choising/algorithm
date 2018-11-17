package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RoomNumber1475 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[9];
		
		String a = s.replaceAll("9", "6");
		for (String b : a.split("")) {
			arr[Integer.parseInt(b)]++;
		}
		arr[6] = arr[6]%2 == 0? arr[6]/2 : arr[6]/2+1;
		System.out.println(Arrays.stream(arr).max().orElse(0));
	}
}
