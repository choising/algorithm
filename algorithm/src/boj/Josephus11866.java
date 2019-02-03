package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Josephus11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		List<Integer> answers = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		int key = size - 1;
		
		while(answers.size() != n) {
			int remainSize = list.size();
			if(remainSize <= key) key %= remainSize;
			answers.add(list.remove(key));
			key += size - 1;
		}
		
		StringBuilder sb = new StringBuilder(answers.toString());
		sb.replace(0, 1, "<")
		.replace(sb.length()-1, sb.length(), ">");
		System.out.println(sb.toString());
	}

}
