package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int result1 = p.product(5, 6);
        System.out.println("The product of 5 and 6 is: " + result1);


        int result2 = p.product(5, 6, 7);
        System.out.println("The product of 5,6 and 7 is: " + result2);

        double result3 = p.product(5.5, 6.6);
        System.out.println("The product of 5.5 and 6.5 is: " + result3);
    }


    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }
}