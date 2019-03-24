package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SangGeunNald5543 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		for(int i = 0; i < 2; i++) {
			list2.add(Integer.parseInt(br.readLine()));
		}
		
		int answer = Collections.min(list) + Collections.min(list2) - 50;
		System.out.println(answer);
	}

}
