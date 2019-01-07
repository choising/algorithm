package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Stranger1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		List<String> answers = new ArrayList<>();
		
		for(int i = 0; i < n; i++){
			map.put(br.readLine(), 0);
		}
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			if(map.getOrDefault(s, 9) != 9) {
				answers.add(s);
			}
		}
		
		Collections.sort(answers);
		System.out.println(answers.size());
		for (String s : answers) {
			System.out.println(s);
		}
	}
}
