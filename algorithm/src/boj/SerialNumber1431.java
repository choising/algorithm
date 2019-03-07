package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerialNumber1431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<SerialNo> list = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			list.add(new SerialNo(br.readLine()));
		}
		Collections.sort(list);
		for(SerialNo sn : list) {
			System.out.println(sn);
		}
	}
}

class SerialNo implements Comparable<SerialNo> {
	private String s;
	private int sum;
	
	public SerialNo(String s) {
		this.s = s;
		this.sum = this.calcSum(s);
	}
	
	private int calcSum(String s) {
		int sum = 0;
		int size = s.length();
		for(int i = 0; i < size; i++) {
			int n = 0;
			try {
				n = Integer.parseInt(s.substring(i, i+1));				
			} catch(Exception e) {
				
			}
			sum += n;
			
		}
		return sum;
	}

	@Override
	public String toString() {
		return s;
	}

	@Override
	public int compareTo(SerialNo sn) {
		// TODO Auto-generated method stub
		if(this.s.length() < sn.s.length()) return -1;
		if(this.s.length() > sn.s.length()) return 1;
		if(this.sum < sn.sum) return -1;
		if(this.sum > sn.sum) return 1;
		return s.compareTo(sn.s);
	}
}
