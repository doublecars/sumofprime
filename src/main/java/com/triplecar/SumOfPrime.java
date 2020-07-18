package com.triplecar;

public class SumOfPrime {
        public static void main(String[] args) {
            long start = System.currentTimeMillis();
            long sum = getSum1(200000);
            long end = System.currentTimeMillis();
            System.out.println("the method1 of sum of prime:" + sum + ",the time cost is :" + (end - start) + "ms");

            start = System.currentTimeMillis();
            sum = getSum2(200000);
            end = System.currentTimeMillis();
            System.out.println("the method2 of sum of prime:" + sum + ",the time cost is :" + (end - start) + "ms");

        }

        public static long getSum2(int n) {
            long sum = 0;
            boolean flag = true;

            for (int i = 2; i <= n; i++) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sum += i;
                }

                flag = true;
            }
            return sum;
        }


        public static long getSum1(int n) {
            long sum = 0;
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    sum += i;
                }
                flag = true;
            }
            return sum;

        }


}
