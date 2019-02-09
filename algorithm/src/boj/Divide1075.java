package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        int a = n - n%100;
        System.out.println(go(a,f));
    }

    private static String go(int a, int f) {
        for(int i = a; i < a+100; i++) {
            if(i % f == 0) {
                int answer = i%100;
                return answer < 10 ? "0" + answer : String.valueOf(answer);
            }
        }
        return "";
    }
}
