package boj;

import java.util.Scanner;

public class GCDLCM2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GCDLCM2609 gl = new GCDLCM2609();
		int[] arr = gl.solution(sc.nextInt(), sc.nextInt());
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		sc.close();
	}

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = (m>n)?euclidean(n,m):euclidean(m,n);
        int max = (n * m) / min;
        answer[0] = min;
        answer[1] = max;
        return answer;
    }
    
    public int euclidean(int n, int m) {
    	// m > n
    	if(n == 0) {
    		return m;
    	}
    	return euclidean(m%n, n);
    	
    }
}
