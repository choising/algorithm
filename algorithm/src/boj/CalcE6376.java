package truckparking;

public class CalcE6376 {
    public static void main(String[] args) {
        System.out.println("n e");
        System.out.println("- -----------");
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 1.0 / fac(i);
            double e = 0;
            for (double v : arr) {
                e += v;
            }
            if (isInteger(e)) {
                System.out.println(i + " " + (int) e);
            } else if (isLess10(e)) {
                System.out.println(i + " " + e);
            } else{
                System.out.println(i + " " + String.format("%.9f", e));
            }
        }
    }

    private static boolean isInteger(double d) {
        double minus = d - (int) d;
        return minus == 0;
    }

    private static boolean isLess10(double d) {
        return String.valueOf(d).length() < 12;
    }

    private static long fac(int n) {
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }
}
