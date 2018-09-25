package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Average1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Double> answerList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int max = Collections.max(list);
		for(Integer element : list) {
			answerList.add((double)element/max*100.0);
		}
		System.out.println(answerList.stream().mapToDouble(i -> (double)i).average().orElse(0.0));
		
		
		sc.close();
	}

}
