package boj;

import java.util.Scanner;

public class LCM1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int min = (m>n)?euclidean(n,m):euclidean(m,n);
	        int max = (n * m) / min;
	        System.out.println(max);
		}
		sc.close();
	}
    
    static int euclidean(int n, int m) {
    	// m > n
    	if(n == 0) {
    		return m;
    	}
    	return euclidean(m%n, n);
    	
    }

}
