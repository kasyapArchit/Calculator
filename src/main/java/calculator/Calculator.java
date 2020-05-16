package calculator;

import java.util.*;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static long multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        double ans;
        if (b == 0) {
            throw new IllegalArgumentException("Divison by zero");
        } else {
            ans = Double.valueOf(a)/Double.valueOf(b);
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println("6 + 2 = " + add(6, 2));
        System.out.println("6 - 2 = " + subtract(6, 2));
        System.out.println("6 * 2 = " + multiply(6, 2));
        System.out.println("6 / 2 = " + divide(6, 2));
    }
}