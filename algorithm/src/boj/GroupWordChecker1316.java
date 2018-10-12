package boj;

import java.util.Scanner;

public class GroupWordChecker1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(solution(s)) cnt++; 
		}
		
		System.out.println(cnt);
		sc.close();
	}

	public static boolean solution(String s) {
		String newS = "";
		newS += s.charAt(0);
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i-1) != s.charAt(i)) {
				newS += s.charAt(i);
			}
		}

		while(newS.length() != 1) {
			String temp = String.valueOf(newS.charAt(0));
			newS = newS.substring(1, newS.length());
			if(newS.indexOf(temp) != -1) return false;
		}
			
		return true;
	}
}
