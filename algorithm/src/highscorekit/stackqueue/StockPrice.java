/*주식가격
문제 설명
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 유지된 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.
입출력 예
prices	return
[498,501,470,489]	[2,1,1,0]
입출력 예 설명
1초 시점의 ₩498은 2초간 가격을 유지하고, 3초 시점에 ₩470으로 떨어졌습니다.
2초 시점의 ₩501은 1초간 가격을 유지하고, 3초 시점에 ₩470으로 떨어졌습니다.
3초 시점의 ₩470은 최종 시점까지 총 1초간 가격이 떨어지지 않았습니다.
4초 시점의 ₩489은 최종 시점까지 총 0초간 가격이 떨어지지 않았습니다.
*/
package highscorekit.stackqueue;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {498,501,470,489};
		StockPrice sp = new StockPrice();
		sp.solution(arr);
	}

	public int[] solution(int[] prices) {
        int[] answer = {};
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < prices.length; i++) {
        	int time = 0;
        	for(int j = i; j < prices.length; j++) {
        		if(prices[j] < prices[i]) {
        			time = j-i;
        			break;
        		}
        	}
        	if(time == 0) {
        		time = prices.length - 1 - i;
        	}
        	ans.add(time);
        }
        answer = ans.stream().mapToInt(i -> (int) i).toArray();
        return answer;
    }
}
