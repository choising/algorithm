package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSeller1302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, SoldBook> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			go(map, s);
		}
		List<SoldBook> list = new ArrayList<>(map.values());
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}

	private static void go(Map<String, SoldBook> map, String s) {
		if(map.get(s) == null) {
			map.put(s, new SoldBook(s, 1));
			return;
		}
		map.get(s).addCount();
	}
}

class SoldBook implements Comparable<SoldBook>{
	private String key;
	private int count;

	public void setKey(String key) {
		this.key = key;
	}

	public void addCount() {
		this.count += 1;
	}
	
	public SoldBook(String key, int count) {
		this.key = key;
		this.count = count;
	}

	@Override
	public int compareTo(SoldBook b) {
		if(this.count > b.count) return 1;
		if(this.count < b.count) return -1;
		return b.key.compareTo(this.key);
	}

	@Override
	public String toString() {
		return key;
	}
}
