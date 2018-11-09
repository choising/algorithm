package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumABFive10952 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		while(a != 0 && b != 0) {
			System.out.println(a+b);
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st2.nextToken());
			b = Integer.parseInt(st2.nextToken());
		}
	}
}
