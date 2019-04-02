package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrafficLight2980 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int location = 0;
		int time = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			
			int rPlusG = r+g;
			
			time += d - location;
			location = d;
			
			int mod = time % rPlusG;
			if(mod >= r) {
				continue;
			}
			else {
				time += r - mod;
			}
			
		}
		time += l - location;
		System.out.println(time);
	}

}
