package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SequenceSort1015 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Pair> list = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			list.add(new Pair(i, Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(list);
		
		int[] answers = new int[size];
		for(int i = 0; i < size; i++) {
			answers[list.get(i).getIndex()] = i;
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(answers[i] + " ");
		}
	}

}

class Pair implements Comparable<Pair>{
	private int index;
	private int value;
	
	public Pair(int index, int value) {
		super();
		this.index = index;
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(Pair p) {
		// TODO Auto-generated method stub
		if(this.value > p.value) return 1;
		if(this.value < p.value) return -1;
		return 0;
	}
	
}
