package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CoinZero11047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int element = Integer.parseInt(br.readLine());
			if(element <= k) list.add(element);
		}
		
		int count = 0;
		Collections.reverse(list);
		
		for(int coin : list) {
			while(k > 0) {
				k -= coin;
				count++;
			}
			if(k == 0) break;
			k += coin;
			count--;
		}
		System.out.println(count);		
	}

}
