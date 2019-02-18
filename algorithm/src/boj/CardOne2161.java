package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CardOne2161 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}

		List<Integer> answer = new ArrayList<>();
		while(list.size() > 1) {
			answer.add(list.remove(0));
			list.add(list.get(0));
			list.remove(0);
		}
		
		answer.add(list.remove(0));
		
		for(Integer i : answer) {
			System.out.print(i + " ");
		}
		
	}

}
