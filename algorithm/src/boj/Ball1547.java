package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ball1547 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<Cup> list = new ArrayList<>();
		list.add(new Cup(1, 1));
		list.add(new Cup(2, 2));
		list.add(new Cup(3, 3));
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int aIndex = Integer.parseInt(st.nextToken());
			int bIndex = Integer.parseInt(st.nextToken());
			findCup(list, aIndex).swap(findCup(list, bIndex));
		}
		
		Cup cup = findAnswer(list, 1);
		
		if(cup != null) {
			System.out.println(cup.getRealIndex());
		} else {
			System.out.println(-1);
		}
	}
	
	private static Cup findCup(List<Cup> list, int index) {
		for(Cup c : list) {
			if(c.isEqual(index)) return c;
		}
		return null;
	}
	
	private static Cup findAnswer(List<Cup> list, int index) {
		for(Cup c : list) {
			if(c.isCur(index)) return c;
		}
		return null;
	}
}

class Cup {
	private int realIndex;
	private int curIndex;
	
	public Cup(int realIndex, int curIndex) {
		this.realIndex = realIndex;
		this.curIndex = curIndex;
	}

	public int getRealIndex() {
		return realIndex;
	}

	public int getCurIndex() {
		return curIndex;
	}
	
	public void swap(Cup other) {
		int temp = this.curIndex;
		this.curIndex = other.curIndex;
		other.curIndex = temp;
	}
	
	public boolean isEqual(int index) {
		return this.realIndex == index;
	}

	public boolean isCur(int index) {
		return this.curIndex == index;
	}
}
