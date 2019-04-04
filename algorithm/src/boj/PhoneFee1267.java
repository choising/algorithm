package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PhoneFee1267 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i : list) {
			int x = i / 30;
			x += 1;
			sum1 += x * 10;
			
			int y = i / 60;
			y += 1;
			sum2 += y * 15;			
		}
		
		if(sum1 < sum2) {
			System.out.println("Y" + " " + sum1);
		} else if (sum1 > sum2) {
			System.out.println("M" + " " + sum2);
		} else {
			System.out.println("Y" + " " + "M" + " " + sum1);
		}
		
	}

}
