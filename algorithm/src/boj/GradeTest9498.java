package boj;

import java.util.Scanner;

public class GradeTest9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
		sc.close();
	}

	public static String solution(int n) {
		if(n <= 100 && n >= 90){
			return "A";
		}
		if(n <= 89 && n >= 80){
			return "B";
		}
		if(n <= 79 && n >= 70){
			return "C";
		}
		if(n <= 69 && n >= 60){
			return "D";
		}
		return "F";
	}
}
