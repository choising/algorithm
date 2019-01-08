package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AgeSort10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Joiner> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new Joiner(Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		
		Collections.sort(list);

		for (Joiner j : list) {
			System.out.println(j);
		}
	}

}

class Joiner implements Comparable<Joiner> {
	private int age;
	private String name;
	
	public Joiner(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Joiner o) {
		// TODO Auto-generated method stub
		if(this.age > o.age) return 1;
		if(this.age < o.age) return -1;
		return 0;
	}

	@Override
	public String toString() {
		return age + " " + name;
	}
}
