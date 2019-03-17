package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TextMessage2037 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		String[] arr = s.split("");
		
		int sum = 0;
		Alpha pre = null;
		for(String ss : arr) {
			if(ss.equals(" ")) {
				sum += p;
				pre = null;
				continue;
			}
			Alpha a = Alpha.isAlpha(ss);
			if(pre == null) {
				sum += a.count(ss) * p;
				pre = a;
				continue;
			}
			
			if(pre.equals(a)) {
				sum += w;
				sum += a.count(ss) * p;
				pre = a;
				continue;
			}
			sum += a.count(ss) * p;
			pre = a;
		}
		
		System.out.println(sum);
		
	}


}

enum Alpha {
	TWO("A", "B", "C", "DUMMY"),
	THREE("D", "E", "F", "DUMMY"),
	FOUR("G", "H", "I", "DUMMY"),
	FIVE("J", "K", "L", "DUMMY"),
	SIX("M", "N", "O", "DUMMY"),
	SEVEN("P", "Q", "R", "S"),
	EIGHT("T", "U", "V", "DUMMY"),
	NINE("W", "X", "Y", "Z");
	
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	
	private Alpha(String s1, String s2, String s3, String s4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}
	
	public static Alpha isAlpha(String s) {
		for(Alpha a : values()) {
			if(a.s1.equals(s) || a.s2.equals(s) || a.s3.equals(s) || a.s4.equals(s)) return a;
		}
		return null;
	}
	
	public int count(String s) {
		if(this.s1.equals(s)) return 1;
		if(this.s2.equals(s)) return 2;
		if(this.s3.equals(s)) return 3;
		return 4;
	}
}
