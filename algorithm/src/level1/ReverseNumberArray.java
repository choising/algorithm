/*�ڿ��� ������ �迭�� �����
���� ����
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
����� ��
n	return
12345	[5,4,3,2,1]*/
package level1;

public class ReverseNumberArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumberArray rna = new ReverseNumberArray();
		System.out.println(rna.solution(12345)[0]);
		
	}
	
	public int[] solution(long n) {
		int[] answer = {};
		String s = Long.toString(n);
		answer = new int[s.length()];
		int cnt = 0;
		while(n > 0) {
			answer[cnt] = (int)(n % 10);
			n = n / 10;
			cnt++;			
		}
		return answer;
/*		int[] answer = {};
		List<String> list = new ArrayList<>();
		String[] answerString = Long.toString(n).split("");
		list = Arrays.asList(answerString);
		Collections.reverse(list);
		answer = list.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
	    return answer;*/
	}

}
