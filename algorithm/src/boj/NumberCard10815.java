package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class NumberCard10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		List<Integer> have = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			have.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(have);
		
		br.readLine();
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(st2.hasMoreTokens()) {
			int a = Collections.binarySearch(have, Integer.parseInt(st2.nextToken())) >= 0 ? 1 : 0;
			sb.append(a).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
