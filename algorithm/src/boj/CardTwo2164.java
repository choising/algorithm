package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class CardTwo2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		while(list.size() != 1) {
			list.remove(0);
			list.add(list.remove(0));
		}
		System.out.println(list.get(0));
	}
}
