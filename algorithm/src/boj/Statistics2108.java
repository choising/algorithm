package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistics2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		double sum = 0;
		for(int i = 0; i < size; i++) {
			sum += list.get(i);
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : list) {
			if(map.get(i) == null) map.put(i, 1);
			else map.put(i, map.get(i) + 1);
		}
		
		int max = 0;

		for (int key : map.keySet()) {
			if(map.get(key) > max) max = map.get(key);
		}
		
		List<Integer> list2 = new ArrayList<>();
		
		for (int key : map.keySet()) {
			if(map.get(key) == max) list2.add(key);
		}
		
		Collections.sort(list2);
		int often = 0;
		if(list2.size() == 1) often = list2.get(0);
		else often = list2.get(1);
		
		int avg = (int) Math.round(sum/size);
		int mid = list.get(size/2);
		int bound = Collections.max(list) - Collections.min(list);
		
		System.out.println(avg);
		System.out.println(mid);
		System.out.println(often);
		System.out.println(bound);
	}
}
