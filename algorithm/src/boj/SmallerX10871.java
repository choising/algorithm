package boj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SmallerX10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if(temp < x) {
				list.add(temp);
			}
		}
		
		for(Integer element : list) {
			System.out.print(element+" ");
		}
		sc.close();
	}

}
