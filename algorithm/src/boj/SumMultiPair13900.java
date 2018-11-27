package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SumMultiPair13900 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		long sum = 0;
		
		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken()); 
			list.add(value);
			sum += value;
		}
		
		long answer = 0;
		
		for (int i = 0; i < list.size()-1; i++) {
			sum -= list.get(i);
			answer += sum * list.get(i);
		}
		
		System.out.println(answer);
	}

}
