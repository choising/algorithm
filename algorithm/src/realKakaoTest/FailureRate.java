/*실패율
failture_rate1.png

슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.

이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.

실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.

제한사항
스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
stages의 길이는 1 이상 200,000 이하이다.
stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
입출력 예
N	stages	result
5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
4	[4,4,4,4,4]	[4,1,2,3]
입출력 예 설명
입출력 예 #1
1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. 따라서 1번 스테이지의 실패율은 다음과 같다.

1 번 스테이지 실패율 : 1/8
2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.

2 번 스테이지 실패율 : 3/7
마찬가지로 나머지 스테이지의 실패율은 다음과 같다.

3 번 스테이지 실패율 : 2/4
4번 스테이지 실패율 : 1/2
5번 스테이지 실패율 : 0/1
각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.

[3,4,2,1,5]
입출력 예 #2

모든 사용자가 마지막 스테이지에 있으므로 4번 스테이지의 실패율은 1이며 나머지 스테이지의 실패율은 0이다.

[4,1,2,3]*/
package realKakaoTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class FailureRate {
	private static final int INITIAL_FAIL_COUNT = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FailureRate fr = new FailureRate();
		int[] arr = {2,1,2,6,2,4,3,3};
		System.out.println(fr.solution(5, arr));
	}
	
	public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] numberOfPlayer = new int[N+2];
        HashMap<Integer, Double> stageInfo = new HashMap<>();
        answer = new int[N];
        
        getNumberOfPlayers(numberOfPlayer, stages);
        
        for(int i = 1; i <= N+1; i++) {
        	stageInfo.put(new Integer(i), new Double(INITIAL_FAIL_COUNT));
        }
        
        countFail(stageInfo, stages);
        stageInfo.remove(N+1);
        calculateFailure(stageInfo, numberOfPlayer);

        answer = sortByFailure(stageInfo).stream().mapToInt(i -> i).toArray();
        return answer;
    }
	
	public void getNumberOfPlayers(int[] numberOfPlayer, int[] stages) {
		int len = numberOfPlayer.length;
        for(int i = 1; i < len; i++) {
        	numberOfPlayer[i] = 0;
        	for(int j = 0; j < stages.length; j++) {
        		if(stages[j] >= i){
        			numberOfPlayer[i]++;
        		}
        	}
        }
	}
	
	public void countFail(HashMap<Integer, Double> stageInfo, int[] stages) {
        for(int i = 0; i < stages.length; i++) { 
        	double existVal = stageInfo.get(new Integer(stages[i]));
        	double newVal = existVal + 1;
        	stageInfo.put(new Integer(stages[i]), newVal);
        }
	}
	
	public void calculateFailure(HashMap<Integer, Double> stageInfo, int[] numberOfPlayer) {
		for(Integer key : stageInfo.keySet()) {
			double failure = 0.0;
			double failCount = stageInfo.get(key);
			failure = failCount / numberOfPlayer[key];
			stageInfo.put(key, failure);
		}
	}
	
	public List<Integer> sortByFailure(HashMap<Integer, Double> map) {
		List<Integer> keyList = new ArrayList<>();
		keyList.addAll(map.keySet());
		Collections.sort(keyList, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Object FirstValue = map.get(o1);
				Object SecondValue = map.get(o2);
				
				if((Double)FirstValue < (Double) SecondValue) return 1;
				if((Double)FirstValue > (Double) SecondValue) return -1;
				return 0;	
			}
		});
		return keyList;
	}
}







