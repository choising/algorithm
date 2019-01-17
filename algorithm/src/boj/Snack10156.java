package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snack10156 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int price = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		int curMoney = Integer.parseInt(st.nextToken());
		
		int answer = (price * count) - curMoney;
		if(answer <= 0) System.out.println(0);
		else System.out.println(answer);
	}

}
