package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffixArray11656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		List<String> list = new ArrayList<>();
		int size = s.length();
		
		for (int i = 0; i < s.length(); i++) {
			list.add(s.substring(i, size));
		}
		
		Collections.sort(list);
		
		for (String ss : list) {
			System.out.println(ss);
		}
	}

}
