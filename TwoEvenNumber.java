package com.example.inventorysystem;

class TwoEvenNumber {
	
    public static void main(String[] args) {
    	
        int a = 12;
        int b = 20;

        if (a % 2 == 0 && b % 2 == 0) {
            int sum = a + b;
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Both numbers are not even.");
        }
    }
}