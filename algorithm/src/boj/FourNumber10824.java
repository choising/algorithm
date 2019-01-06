package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourNumber10824 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		long n1 = Long.parseLong(s1+s2);
		long n2 = Long.parseLong(s3+s4);
		System.out.println(n1 + n2);
	}

}
