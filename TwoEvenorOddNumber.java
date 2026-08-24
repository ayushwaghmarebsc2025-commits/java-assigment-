package com.example.inventorysystem;

class TwoEvenorOddNumber {
	
    public static void main(String[] args) {
    	
        int a = 11;
        int b = 20;

        int sum = a + b;

        System.out.println("Sum = " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is Even.");
        } else {
            System.out.println("The sum is Odd.");
        }
    }
}