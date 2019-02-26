package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TruckParking2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        for(int i = 1; i <= 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < 101; i++) {
            map.put(i, 0);
        }

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int j = start; j < end; j++) {
                map.put(j, map.get(j) + 1);
            }
        }

        int sum = 0;

        for(int i = 1; i < 101; i++) {
            sum += map.get(i) * arr[map.get(i)];
        }
        System.out.println(sum);
    }
}
