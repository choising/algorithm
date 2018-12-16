package woowa;

import org.junit.Test;

public class Solution4 {
	
    int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (int) Math.round((l + r) / 2.0);
//            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

    @Test
    public void test() {
    	int[] arr = {1,2,5,9,9,9};
//    	int[] arr = {1, 2, 5, 9, 9};
    	for(int i : arr) {
        	System.out.println(solution(arr, i));	
    	}
    	System.out.println(solution(arr, 11));
    }
    
}
