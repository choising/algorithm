package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProfessorHyunWoo3474 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int answer = 0;
			List<Integer> list = new ArrayList<>();
			int five = 5;
			while(five <= n) {
				list.add(five);
				five *= 5;
			}
			
			for (int a : list) {
				answer += n / a;
			}
			System.out.println(answer);
		}
	}

}
