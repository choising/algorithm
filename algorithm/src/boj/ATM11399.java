package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ATM11399 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i) * (list.size() - i);
		}
		System.out.println(sum);
	}
}
