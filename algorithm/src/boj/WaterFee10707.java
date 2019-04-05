package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterFee10707 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine()); // 상한
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		int sum1 = a * p;
		int sum2 = 0;
		if (p <= c) sum2 = b;
		else {
			sum2 = (p-c)*d + b;
		}
		
		System.out.println(sum1 >= sum2 ? sum2 : sum1);
	}

}
