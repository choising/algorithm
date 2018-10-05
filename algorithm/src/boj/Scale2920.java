package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Scale2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		List<Integer> copy = new ArrayList<>();
		for(int i = 0; i < 8; i++) {
			list.add(sc.nextInt());
			copy.add(list.get(i));
		}
		sc.close();

		if(isAs(list, copy)) {
			System.out.println("ascending");
		}else if(isDe(list, copy)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
	
	public static boolean isAs(List<Integer> list, List<Integer> copy) {
		Collections.sort(copy);
		return list.equals(copy);
	}
	
	public static boolean isDe(List<Integer> list, List<Integer> copy) {
		Collections.reverse(copy);
		return list.equals(copy);
	}
}
