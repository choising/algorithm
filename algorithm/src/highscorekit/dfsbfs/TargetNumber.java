/*타겟 넘버
문제 설명
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.
입출력 예
numbers	target	return
[1, 1, 1, 1, 1]	3	5
입출력 예 설명
문제에 나온 예와 같습니다.*/

/*
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}*/

package highscorekit.dfsbfs;

import java.util.ArrayList;
import java.util.List;

public class TargetNumber {
	static int sum = 0;
	
	List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 1, 1};
		TargetNumber tn = new TargetNumber();
		System.out.println(tn.solution(arr, 3));
	}
	
    public int solution(int[] numbers, int target) {
    	int answer = 0;
    	int[][] arr = new int[numbers.length][2];
    	
    	for(int i = 0; i < numbers.length; i++) {
    		arr[i][0] = numbers[i];
    		arr[i][1] = numbers[i] * -1;
    	}
    	
    	boolean[][] visit = new boolean[numbers.length][2];
    	sum = arr[0][0];
    	dfs(arr, visit, 0, 0);
    	
    	sum = arr[0][1];
    	dfs(arr, visit, 0, 1);
    	
    	for(int value : list) {
    		if(target == value) answer++;
    	}
    	
    	return answer;
    }
    
    public void dfs(int[][] arr, boolean[][] visit, int y, int x) {
    	if(y == arr.length-1) {
    		list.add(sum);
    		return;
    	}
    	if(visit[y+1][0] == false) {
    		visit[y+1][0] = true;
    		sum += arr[y+1][0];
    		dfs(arr, visit, y+1, 0);
    		visit[y+1][0] = false;
    		sum -= arr[y+1][0];
    		
    	}
    	if(visit[y+1][1] == false) {
    		visit[y+1][1] = true;
    		sum += arr[y+1][1];
    		dfs(arr, visit, y+1, 1);
    		visit[y+1][1] = false;
    		sum -= arr[y+1][1];
    	}
    }
}
