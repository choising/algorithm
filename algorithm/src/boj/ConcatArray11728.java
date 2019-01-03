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

public class ConcatArray11728 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		List<Integer> list = new ArrayList<>();

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		while(st1.hasMoreTokens()) {
			list.add(Integer.parseInt(st1.nextToken()));
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		while(st2.hasMoreTokens()) {
			list.add(Integer.parseInt(st2.nextToken()));
		}
		
		Collections.sort(list);
		for (long i : list) {
			bw.write(i + " ");
		}
		bw.flush();
		bw.close();
	}
}
