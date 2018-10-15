/*기능개발
문제 설명
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

제한 사항
작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
작업 진도는 100 미만의 자연수입니다.
작업 속도는 100 이하의 자연수입니다.
배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
입출력 예
progresses	speeds	return
[93,30,55]	[1,30,5]	[2,1]
입출력 예 설명
첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.

따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.*/

/*import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}*/

package highscorekit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class FunctionDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        List<Integer> proList = Arrays.stream(progresses).boxed().collect(Collectors.toList());
        List<Integer> speedList = Arrays.stream(speeds).boxed().collect(Collectors.toList());      
        
        while(!proList.isEmpty()) {
        	for(int i = 0; i < proList.size(); i++) {
        		proList.set(i, proList.get(i) + speedList.get(i));
        	}
        	if(proList.get(0) >= 100) {
        		int index = -1;
        		for(int i = 0; i < proList.size(); i++) {
        			if(proList.get(i) < 100) {
        				index = i;
        				break;
        			}
        		}
        		if(index == -1) {
        			index = proList.size();
        			proList.clear();
        			speedList.clear();
            		answerList.add(index);
        		}
        		else {
            		answerList.add(index);
            		for(int i = index-1; i >= 0; i--) {
            			proList.remove(i);
            			speedList.remove(i);
            		}
        		}
        	}
        }
        answer = answerList.stream().mapToInt(i -> (int)i).toArray();
        return answer;
    }
	
	@Test
	public void test() {
		int[] arr1 = {40, 93, 30, 55, 60, 65};
		int[] arr2 = {60, 1, 30, 5 , 10, 7};
		int[] answer = {1,2,3};
		assertEquals(answer, solution(arr1, arr2));
	}
	
	@Test
	public void test2() {
		int[] arr3 = {93,30,55};
		int[] arr4 = {1,30,5};
		int[] answer2 = {2,1};
		assertEquals(answer2, solution(arr3, arr4));
	}
	
	@Test
	public void test3() {
		int[] arr5 = {93, 30, 55, 60, 40, 65};
		int[] arr6 = {1, 30, 5 , 10, 60, 7};
		int[] answer3 = {2,4};
		assertEquals(answer3, solution(arr5, arr6));
	}
	
}
