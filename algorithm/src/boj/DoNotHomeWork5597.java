package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoNotHomeWork5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i <= 30; i++) {
			map.put(i, 0);
		}
		
		for(int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			map.remove(n);
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);

		for (int i : list) {
			System.out.println(i);
		}
	}

}
