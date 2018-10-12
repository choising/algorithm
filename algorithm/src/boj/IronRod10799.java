package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class IronRod10799 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(solution(br.readLine()));
	}

    public static int solution(String arrangement) {
        int answer = 0;
        List<String> list = Arrays.asList(arrangement.split(""));
        Stack<String> st = new Stack<>();
        String pre = list.get(0);
        st.push(pre);
        for(int i = 1; i < list.size(); i++) {
        	if(list.get(i).equals("(")){
        		st.push(list.get(i));
        	}
        	else {
        		st.pop();
        		if(pre.equals("(")){
        			answer += st.size();
        		}
        		else {
        			answer++;
        		}
        	}
        	pre = list.get(i);
        }
        return answer;
    }
}
