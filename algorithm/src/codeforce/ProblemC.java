package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC {
	private static int[][] arr = new int[6][6];
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[0][i] = 9;
			arr[i][0] = 9;
			arr[5][i] = 9;
			arr[i][5] = 9;			
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for (char c : s.toCharArray()) {
			go(c - 48);
			detect();
		}
		printArray();
	}

	public static void printArray() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void deleteX(int x) {
		for(int i = 1; i < 5; i++) {
			arr[x][i] = 0;
		}
	}
	
	public static void deleteY(int y) {
		for(int i = 1; i < 5; i++) {
			arr[i][y] = 0;
		}
	}
	
	public static void go(int i) {
		if(i == 0) {
			go0();
		}
		else {
			go1();
		}
	}
	
	public static void go0() {
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				if(arr[i][j] == 0 && arr[i+1][j] == 0) {
					arr[i][j] = 1;
					arr[i+1][j] = 1;
					System.out.println(i+ " " + j);
					return;
				}
			}
		}
	}
	
	public static void go1() {
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				if(arr[i][j] == 0 && arr[i][j+1] == 0) {
					arr[i][j] = 1;
					arr[i][j+1] = 1;
					System.out.println(i+ " " + j);
					return;
				}
			}
		}
	}
	
	public static void detect() {
		detectX();
		detectY();
	}
	
	public static void detectX() {
		for(int i = 1; i < 5; i++) {
			int check = 1;
			for(int j = 1; j < 5; j++) {
				check &= arr[i][j]; 
			}
			if(check == 1) {
				deleteX(i);
			}
		}
	}
	
	public static void detectY() {
		for(int i = 1; i < 5; i++) {
			int check = 1;
			for(int j = 1; j < 5; j++) {
				check &= arr[j][i]; 
			}
			if(check == 1) {
				deleteY(i);
			}
		}
	}
}
