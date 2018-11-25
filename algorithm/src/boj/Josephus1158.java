package boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();		
		
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		int key = m-1;
		int size = list.size();
		
		while(answer.size() != size) {
			int hereSize = list.size();
			if(key >= hereSize) key %= hereSize;			
			answer.add(list.remove(key));
			key += m-1;
		}
		
		String s = answer.toString();
		System.out.println("<" + s.substring(1, s.length()-1) + ">");
		sc.close();
	}
}
