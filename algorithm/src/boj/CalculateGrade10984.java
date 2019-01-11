package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculateGrade10984 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			double answerSum = 0;
			int sum = 0;
			for (int j = 0; j < m; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int grade = Integer.parseInt(st.nextToken());
				double score = Double.parseDouble(st.nextToken());
				sum += grade;
				answerSum += grade * score;
			}
			
			System.out.println(sum + " " + String.format("%.1f", answerSum/sum));
		}
	}

}
