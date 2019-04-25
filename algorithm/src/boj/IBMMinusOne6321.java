package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IBMMinusOne6321 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			System.out.println("String #" + (i+1));
			for (char c : s.toCharArray()) {
				char cc = (char)(c+1);
				cc = cc > 90 ? (char)65 : cc;
				System.out.print(cc);
			}
			System.out.println();
			System.out.println();
		}

		
	}

}
