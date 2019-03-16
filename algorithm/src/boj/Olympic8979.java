package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Olympic8979 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		List<State> list = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new State(Integer.parseInt(st.nextToken()), 
					Integer.parseInt(st.nextToken()), 
					Integer.parseInt(st.nextToken()), 
					Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(list);
		go(n, list);
	}

	private static void go(int n, List<State> list) {
		State s = list.get(0);
		s.setRank(1);
		if(s.isKey(n)) {
			System.out.println(s.getRank());
			return;
		}
		int duplication = 0;
		for(int i = 1; i < list.size(); i++) {
			State pre = list.get(i-1);
			State cur = list.get(i);
			if(pre.isEqual(cur)) {
				cur.setRank(pre.getRank());
				duplication++;
			}
			else {
				cur.setRank(pre.getRank() + duplication + 1);
				duplication = 0;
			}
			
			if(cur.isKey(n)) {
				System.out.println(cur.getRank());
				return;
			}
		}
	}

}

class State implements Comparable<State> {
	private int key;
	private int gold;
	private int silver;
	private int bronze;
	private int rank;
	
	public State(int key, int gold, int silver, int bronze) {
		this.key = key;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}

	public int getKey() {
		return key;
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public boolean isKey(int key) {
		return this.key == key;
	}
	
	public boolean isEqual(State s) {
		return this.gold == s.gold && 
				this.silver == s.silver && 
				this.bronze == s.bronze;
	}

	@Override
	public int compareTo(State s) {
		// TODO Auto-generated method stub
		if(this.gold > s.gold) return -1;
		if(this.gold < s.gold) return 1;
		if(this.silver > s.silver) return -1;
		if(this.silver < s.silver) return 1;
		if(this.bronze > s.bronze) return -1;
		if(this.bronze < s.bronze) return 1;
		return 0;
	}
}

