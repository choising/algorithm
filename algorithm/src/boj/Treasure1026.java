package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Treasure1026 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> a = new ArrayList<>();
		while(st.hasMoreTokens()) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		List<Integer> b = new ArrayList<>();
		while(st2.hasMoreTokens()) {
			b.add(Integer.parseInt(st2.nextToken()));
		}
		
		Collections.sort(a);
		Collections.sort(b, Collections.reverseOrder());
		
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i) * b.get(i);
		}
		
		System.out.println(sum);
	}

}
