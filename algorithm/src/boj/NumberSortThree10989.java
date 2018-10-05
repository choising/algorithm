package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumberSortThree10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[] arr = new int[10001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[x]++;
		}
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush();
	}

}
