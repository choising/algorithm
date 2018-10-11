package boj;

import java.util.Arrays;
import java.util.Scanner;

public class StudyWord1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] chars = word.toCharArray();
		sc.close();
		solution(chars);
		
	}

	static void solution(char[] chars) {
		int[] count = new int[26];
		for(int i = 0; i < count.length; i++) {
			for(char ch : chars) {
				if(ch == 65+i || ch == 97+i) count[i]++;
			}
		}
		
		int[] copy = Arrays.copyOf(count, 26);
		Arrays.sort(copy);
		
		if(copy[25] == copy[24]) {
			System.out.println("?");
			return;
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] == copy[25]) {
				char c = (char)(65+i);
				System.out.println(c);
			}
		}
	}
}
