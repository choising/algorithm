package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HowMuch9325 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int price = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				price += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			}
			System.out.println(price);
		}
	}	

}
