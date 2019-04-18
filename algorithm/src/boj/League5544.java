package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class League5544 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<MyTeam> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			list.add(new MyTeam(i, 0));
		}
		
		for (int i = 0; i < (n * (n-1)) / 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int team1 = Integer.parseInt(st.nextToken());
			int team2 = Integer.parseInt(st.nextToken());
			int score1 = Integer.parseInt(st.nextToken());
			int score2 = Integer.parseInt(st.nextToken());
			if (score1 == score2) {
				list.get(team1 - 1).addScroe(1);
				list.get(team2 - 1).addScroe(1);
			}
			else if (score1 > score2) {
				list.get(team1 - 1).addScroe(3);
			}
			else {
				list.get(team2 - 1).addScroe(3);
			}
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		int[] rank = new int[n+1];
		int r = 1;
		int dup = 1;
		for (int i = 0; i < n-1; i++) {
			rank[list.get(i).getIndex()] = r;
			if (list.get(i).isSame(list.get(i+1))) {
				dup++;
			}
			else {
				r += dup;
				dup = 1;
			}
		}
		
		rank[list.get(n-1).getIndex()] = r;
		
		for (int i = 1; i <= n; i++) {
			System.out.println(rank[i]);
		}
	}
}

class MyTeam implements Comparable<MyTeam>{
	private int index;
	private int score;
	
	public MyTeam(int index, int score) {
		this.index = index;
		this.score = score;
	}

	public int getIndex() {
		return index;
	}

	public int getScore() {
		return score;
	}
	
	public void addScroe(int score) {
		this.score += score;
	}
	
	public boolean isSame(MyTeam other) {
		return this.score == other.score;
	}
	
	@Override
	public String toString() {
		return "MyTeam [index=" + index + ", score=" + score + "]";
	}

	@Override
	public int compareTo(MyTeam o) {
		// TODO Auto-generated method stub
		if (this.score < o.score) return 1;
		if (this.score > o.score) return -1;
		return 0;
	}
}
