package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SortCoordinatetwo11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<CoordinateForSort> list = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new CoordinateForSort(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}

class CoordinateForSort implements Comparable<CoordinateForSort>{
	private int x;
	private int y;
	
	public CoordinateForSort(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}

	@Override
	public int compareTo(CoordinateForSort o) {
		// TODO Auto-generated method stub
		if(this.y > o.y) return 1;
		if(this.y < o.y) return -1;
		if(this.x > o.x) return 1;
		if(this.x < o.x) return -1;
		return 0;
	}
	
}
