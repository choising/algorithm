package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountPartOfString11478 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int sum = 0;
		for(int i = 1; i <= s.length(); i++) {
			sum += go(s, i);
		}
		System.out.println(sum);
	}
	
	public static int go(String s, int x) {
		Set<String> set = new HashSet<>();
		for(int i = 0; i <= s.length()-x; i++) {
			set.add(s.substring(i, i+x));
		}
		return set.size();
	}

}
