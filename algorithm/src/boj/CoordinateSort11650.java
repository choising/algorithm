package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CoordinateSort11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Coordinate> list = new ArrayList<>(); 
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		Collections.sort(list);
		for(Coordinate c : list) {
			System.out.println(c);
		}
	}

}
class Coordinate implements Comparable<Coordinate> {
	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Coordinate o) {
		if(this.x > o.x) return 1;
		if(this.x < o.x) return -1;
		if(this.y > o.y) return 1;
		if(this.y < o.y) return -1;
		return 0;
	}
	@Override
	public String toString() {
		return x + " " + y;
	}
}
