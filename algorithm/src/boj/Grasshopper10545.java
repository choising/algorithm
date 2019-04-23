package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Grasshopper10545 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<KeyPad> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			int n = Integer.parseInt(st.nextToken());
			list.add(new KeyPad(i, arr[n].split("")));
		}
		
		String[] mArr = br.readLine().split("");
		int pre = 0;
		String answer = "";
		
		for (int i = 0; i < mArr.length; i++) {
			for (KeyPad k : list) {
				if (k.count(mArr[i]) != -1) {
					if (pre == k.getKey()) answer += "#";
					pre = k.getKey();
					for (int j = 0; j < k.count(mArr[i]); j++) {
						answer += k.getKey();
					}
				}
			}
		}
		
		System.out.println(answer);
	}

}

class KeyPad {
	private int key;
	private String[] arr;
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String[] getArr() {
		return arr;
	}
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	
	public int count(String s) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(s)) return i+1;  
		}
		return -1;
	}
	
	public KeyPad(int key, String[] arr) {
		this.key = key;
		this.arr = arr;
	}
}
