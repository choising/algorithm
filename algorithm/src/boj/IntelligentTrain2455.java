package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntelligentTrain2455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		sc.nextInt();
		list.add(sc.nextInt());
		for(int i = 1; i < 4; i++) {
			list.add(list.get(i-1) - sc.nextInt() + sc.nextInt());
		}
		
		System.out.println(Collections.max(list));
		sc.close();
	}

}
