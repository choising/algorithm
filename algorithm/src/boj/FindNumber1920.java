package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FindNumber1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());
			map.put(key, 1);
		}
		br.readLine();
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		while(st2.hasMoreTokens()) {
			int key = Integer.parseInt(st2.nextToken());
			if(map.get(key) == null) System.out.println(0);
			else System.out.println(1);
		}
	}
}
