package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class RewardHunter15953 {
	static Map<Integer, Integer> aMap = new HashMap<>();
	static Map<Integer, Integer> bMap = new HashMap<>();
	
	static {
		aMap.put(0, 0);
		aMap.put(1, 5000000);
		
		settingMap(aMap, 2, 3, 3000000);
		settingMap(aMap, 4, 6, 2000000);
		settingMap(aMap, 7, 10, 500000);
		settingMap(aMap, 11, 15, 300000);
		settingMap(aMap, 16, 21, 100000);
		settingMap(aMap, 22, 100, 0);
		
		bMap.put(0, 0);
		bMap.put(1, 5120000);
		
		settingMap(bMap, 2, 3, 2560000);
		settingMap(bMap, 4, 7, 1280000);
		settingMap(bMap, 8, 15, 640000);
		settingMap(bMap, 16, 31, 320000);
		settingMap(bMap, 32, 64, 0);
	}
	
	public static void settingMap(Map<Integer, Integer> map, int rank1, int rank2, int reward) {
		for(int i = rank1; i <= rank2; i++) {
			map.put(i, reward);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			System.out.println(aMap.get(Integer.parseInt(st.nextToken())) + bMap.get(Integer.parseInt(st.nextToken())));
		}
	}

}
