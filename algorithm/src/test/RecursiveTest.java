package test;

import java.util.Arrays;

public class RecursiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(addArr(arr));
	}
	
	public static int addArr(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
		return addArr(newArr) + arr[0];
	}

}
