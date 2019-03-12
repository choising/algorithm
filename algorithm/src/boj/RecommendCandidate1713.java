package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RecommendCandidate1713 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Student> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int key = Integer.parseInt(st.nextToken());
			int index = isContain(key, list);
			if(index != -1) {
				list.get(index).hit();
				eatAges(list);
				continue;
			}
			
			if(!isFull(size, list)) {
				eatAges(list);
				list.add(new Student(key));
				continue;
			}
			
			removeStudent(list);
			eatAges(list);
			list.add(new Student(key));
		}
		List<Integer> answers = new ArrayList<>();
		for(Student s : list) {
			answers.add(s.getKey());
		}
	
		Collections.sort(answers);
		for(int i = 0; i < answers.size() - 1; i++) {
			System.out.print(answers.get(i) + " ");
		}
		System.out.println(answers.get(answers.size()-1));
		
	}

	static void eatAges(List<Student> list) {
		for(Student s : list) {
			s.eatAge();
		}
	}
	
	static int isContain(int key, List<Student> list) {		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).isStudent(key)) return i;
		}
		return -1;
	}
	
	static boolean isFull(int maxSize, List<Student> list) {
		return list.size() == maxSize; 
	}
	
	static void removeStudent(List<Student> list) {
		Collections.sort(list);
		list.remove(list.get(0));
	}

}

class Student implements Comparable<Student>{
	private int key;
	private int age;
	private int hit;
	
	public Student(int key) {
		this.key = key;
		this.age = 1;
		this.hit = 1;
	}
	
	public int getKey() {
		return key;
	}
	
	public boolean isStudent(int key) {
		return key == this.key;
	}

	public void hit() {
		this.hit++;
	}
	
	public void eatAge() {
		this.age++;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.hit > s.hit) return 1;
		if(this.hit < s.hit) return -1;
		if(this.age > s.age) return -1;
		if(this.age < s.age) return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Student [key=" + key + ", age=" + age + ", hit=" + hit + "]";
	}


}
