package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Firecracker1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int[] arr = new int[t];
        for(int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= max; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i % arr[j] == 0) {
                    set.add(i);
                    break;
                }
            }
        }
        System.out.println(set.size());
    }
}
