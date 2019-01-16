package boj;

import java.util.*;

public class BinomialCoefficient11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		double facA = 1;
		double facB = 1;
		double facC = 1;
        
		for (int i = 2; i <= a; i++){
			facA *= i;
			if(i == b) facB = facA;
			if(i == (a - b)) facC = facA;
		}
        
		int answer = (int) (facA / (facB * facC));
		System.out.println(answer);
	}

}

