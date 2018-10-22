package test;

import java.util.Arrays;

public class Possible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7, 9};
		p(arr, 0, 5, 3);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void p(int[] arr, int d, int n, int r) {
		if(r == 0) {
			for(int i = 0; i < d; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}
		for(int i = d; i < n; i++) {
			swap(arr, d, i);
			p(arr, d+1, n, r-1);
			swap(arr, d, i);
		}
	}
	

}
