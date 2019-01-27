package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class PrinterQueue1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int index = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			List<PriorityElement> list = new ArrayList<>();
			for(int j = 0; j < n; j++) {
				list.add(new PriorityElement(Integer.parseInt(st.nextToken()), j));
			}
			PriorityElement e = Collections.max(list);
			int count = 1;
			while(e.getIndex() != index) {
				int maxIndex = list.indexOf(e);
				for(int k = 0; k < maxIndex; k++) {
					list.add(list.remove(0));
				}
				list.remove(0);
				count++;
				e = Collections.max(list);
			}
			System.out.println(count);
		}
	}
}

class PriorityElement implements Comparable<PriorityElement> {
	private int priority;
	private int index;
	
	public PriorityElement(int priority, int index) {
		this.priority = priority;
		this.index = index;
	}

	public int getPriority() {
		return priority;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public int compareTo(PriorityElement o) {
		// TODO Auto-generated method stub
		if(this.priority > o.priority) return 1;
		if(this.priority < o.priority) return -1;
		return 0;
	}
}
