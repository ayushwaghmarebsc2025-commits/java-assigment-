package com.example.inventorysystem;

class TwoOddNumber {
	
    public static void main(String[] args) {
    	
        int a = 15;
        int b = 25;

        if (a % 2 != 0 && b % 2 != 0) {
            int sum = a + b;
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Both numbers are not odd.");
        }
    }
}