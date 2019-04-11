package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class NumberOfVowel10987 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
		int answer = 0;
		for (char c : s.toCharArray()) {
			if (list.contains(c)) answer++; 
		}
		
		System.out.println(answer);
	}

}
