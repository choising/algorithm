package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalcScore2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Score> list = new ArrayList<>();
		for(int i = 0; i < 8; i++) {
			list.add(new Score(i, Integer.parseInt(br.readLine())));
		}
		
		Collections.sort(list);
		int sum = 0;
		List<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			sum += list.get(i).getScore();
			list2.add(list.get(i).getPosition() + 1);
		}
		
		System.out.println(sum);
		
		Collections.sort(list2);
		
		for (int i : list2) {
			System.out.print(i + " ");
		}
	}

}

class Score implements Comparable<Score>{
	private int position;
	private int score;
	
	@Override
	public int compareTo(Score s) {
		// TODO Auto-generated method stub
		if(this.score > s.score) return -1;
		if(this.score < s.score) return 1;
		return 0;
	}

	public Score(int position, int score) {
		this.position = position;
		this.score = score;
	}

	public int getPosition() {
		return this.position;
	}

	public int getScore() {
		return this.score;
	}
}