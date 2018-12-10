package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stick1094 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String binString = Integer.toBinaryString(Integer.parseInt(br.readLine()));
		for (char c : binString.toCharArray()) {
			if(c == '1') count++;
		}
		System.out.println(count);
	}

}
