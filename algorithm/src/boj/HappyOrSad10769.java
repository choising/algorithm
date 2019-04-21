package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HappyOrSad10769 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int index = 0;
		int happy = 0;
		int sad = 0;
		
		while (index != -1) {
			index = s.indexOf(":-)", index);
			if (index != -1) {
				happy++;
				index++;
			}
		}
		
		index = 0;
		
		while (index != -1) {
			index = s.indexOf(":-(", index);
			if (index != -1) {
				sad++;
				index++;
			}
		}
		
		if (happy == 0 && sad == 0) {
			System.out.println("none");
		} else if (happy == sad) {
			System.out.println("unsure");
		} else if (happy > sad) {
			System.out.println("happy");
		} else if (sad > happy) {
			System.out.println("sad");
		}
	}

}
