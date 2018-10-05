package boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfWord1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char[] arr = s.toCharArray();
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ') {
				if(sb.length() != 0) {
					list.add(sb.toString());
					sb.setLength(0);
				}				
			}
			else {
				sb.append(arr[i]);
			}
		}
		if(sb.length() != 0) list.add(sb.toString());
		System.out.println(list.size());
		System.out.println(list);
		
	}
}
