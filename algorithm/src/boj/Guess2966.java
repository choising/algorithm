package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Guess2966 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] sArr = br.readLine().split("");
		
		String[] arr1 = {"A", "B", "C"};
		String[] arr2 = {"B", "A", "B", "C"};
		String[] arr3 = {"C", "C", "A", "A", "B", "B"};
		
		
		List<Applicant> list = new ArrayList<>();
		list.add(new Applicant("Adrian", 0, arr1));
		list.add(new Applicant("Bruno", 0, arr2));
		list.add(new Applicant("Goran", 0, arr3));
		
		for (Applicant a : list) {
			a.test(sArr);
		}
		
		Collections.sort(list);
		
		int max = list.get(0).getScore();
		
		System.out.println(max);
		for (Applicant a : list) {
			if(max == a.getScore()) System.out.println(a.getName());
		}
		
	}

}

class Applicant implements Comparable<Applicant>{
	private String name;
	private int score;
	private String[] arr;
	
	public Applicant(String name, int score, String[] arr) {
		this.name = name;
		this.score = score;
		this.arr = arr;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void test(String[] problems) {
		for(int i = 0; i < problems.length; i++) {
			if(problems[i].equals(this.arr[i % arr.length])) score++;
		}
	}
	
	@Override
	public String toString() {
		return "Applicant [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Applicant a) {
		// TODO Auto-generated method stub
		if(this.score < a.score) return 1;
		if(this.score > a.score) return -1;		
		return this.name.compareTo(a.name);
	}
	
}
