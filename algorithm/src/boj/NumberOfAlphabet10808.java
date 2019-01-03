package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfAlphabet10808 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			int index = (int)c - 97;
			arr[index]++;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
