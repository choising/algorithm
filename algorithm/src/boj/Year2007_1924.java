package boj;

import java.util.Scanner;

public class Year2007_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dayArr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] monArr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < month; i++) {
			sum += monArr[i];
		}
		sum += day;
		System.out.println(dayArr[sum%7]);
		
		sc.close();
	}

}
