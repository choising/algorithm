package boj;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbers11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		int[] arr = new int[n];
		arr = Arrays.stream(str.split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		sc.close();
	}

}
