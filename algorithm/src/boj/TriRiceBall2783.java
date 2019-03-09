package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class TriRiceBall2783 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Double> list = new ArrayList<>();
		list.add(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()));
		}
		Collections.sort(list);
		System.out.println(String.format("%.2f", list.get(0) * 1000));
		
	}

}
