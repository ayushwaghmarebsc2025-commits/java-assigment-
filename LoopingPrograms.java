// Practice programs for For loop, While loop and Do-While loop
// Each task is numbered as per the given problem statement

public class LoopingPrograms {
    public static void main(String[] args) {

        // ---------- Task 1: print 1 to 25 ----------
        System.out.println("Task 1: 1 to 25");
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Task 2: print 25 to 1 ----------
        System.out.println("Task 2: 25 to 1");
        for (int i = 25; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Task 3: print 1 to 100 odd numbers ----------
        System.out.println("Task 3: 1 to 100 odd numbers");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // ---------- Task 4: print 1 to 100 even numbers ----------
        System.out.println("Task 4: 1 to 100 even numbers");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // ---------- Task 5: sum of 1 to 50 odd numbers (using while) ----------
        System.out.println("Task 5: sum of 1 to 50 odd numbers");
        int i5 = 1;
        int sumOdd = 0;
        while (i5 <= 50) {
            if (i5 % 2 != 0) {
                sumOdd = sumOdd + i5;
            }
            i5++;
        }
        System.out.println("Sum = " + sumOdd);

        // ---------- Task 6: sum of 1 to 50 even numbers (using while) ----------
        System.out.println("Task 6: sum of 1 to 50 even numbers");
        int i6 = 1;
        int sumEven = 0;
        while (i6 <= 50) {
            if (i6 % 2 == 0) {
                sumEven = sumEven + i6;
            }
            i6++;
        }
        System.out.println("Sum = " + sumEven);

        // ---------- Task 7: print -45 to +45 ----------
        System.out.println("Task 7: -45 to +45");
        for (int i = -45; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Task 8: print 50 to 100 (using do-while) ----------
        System.out.println("Task 8: 50 to 100");
        int i8 = 50;
        do {
            System.out.print(i8 + " ");
            i8++;
        } while (i8 <= 100);
        System.out.println();

        // ---------- Task 9: sum of odd and even numbers from 1 to 20 ----------
        System.out.println("Task 9: sum of odd and even (1 to 20)");
        int sumOdd9 = 0;
        int sumEven9 = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sumEven9 = sumEven9 + i;
            } else {
                sumOdd9 = sumOdd9 + i;
            }
        }
        System.out.println("Sum of Odd = " + sumOdd9);
        System.out.println("Sum of Even = " + sumEven9);

        // ---------- Task 10: print even and odd label from 1 to 20 (using while) ----------
        System.out.println("Task 10: even and odd label (1 to 20)");
        int i10 = 1;
        while (i10 <= 20) {
            if (i10 % 2 == 0) {
                System.out.println(i10 + " - Even");
            } else {
                System.out.println(i10 + " - Odd");
            }
            i10++;
        }

        // ---------- Task 11: print 1 to 100 ----------
        System.out.println("Task 11: 1 to 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Task 12: print 100 to 1 (using do-while) ----------
        System.out.println("Task 12: 100 to 1");
        int i12 = 100;
        do {
            System.out.print(i12 + " ");
            i12--;
        } while (i12 >= 1);
        System.out.println();

        // ---------- Task 13: print 30 to 50 ----------
        System.out.println("Task 13: 30 to 50");
        for (int i = 30; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Task 14: count of even numbers 1 to 25 ----------
        System.out.println("Task 14: count of even numbers 1 to 25");
        int countEven = 0;
        for (int i = 1; i <= 25; i++) {
            if (i % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Count = " + countEven);

        // ---------- Task 15: count of odd numbers 1 to 25 (using while) ----------
        System.out.println("Task 15: count of odd numbers 1 to 25");
        int i15 = 1;
        int countOdd = 0;
        while (i15 <= 25) {
            if (i15 % 2 != 0) {
                countOdd++;
            }
            i15++;
        }
        System.out.println("Count = " + countOdd);

        System.out.println();
        System.out.println("========== Series Programs ==========");

        // ---------- Series 1: 2 4 6 8 ... 20 ----------
        System.out.println("Series 1: 2 to 20 (step 2)");
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 2: 9 18 27 ... 90 ----------
        System.out.println("Series 2: 9 to 90 (table of 9)");
        for (int i = 9; i <= 90; i = i + 9) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 3: 1 -2 3 -4 5 -6 7 -8 9 -10 ----------
        System.out.println("Series 3: alternating sign");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // ---------- Series 4: 5 10 15 ... 50 ----------
        System.out.println("Series 4: 5 to 50 (table of 5)");
        for (int i = 5; i <= 50; i = i + 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 5: 1 10 100 1000 ----------
        System.out.println("Series 5: 1 10 100 1000");
        int value5 = 1;
        for (int i = 1; i <= 4; i++) {
            System.out.print(value5 + " ");
            value5 = value5 * 10;
        }
        System.out.println();

        // ---------- Series 6: 1 3 6 10 15 21 28 36 45 (triangular numbers) ----------
        System.out.println("Series 6: triangular numbers");
        int sum6 = 0;
        for (int i = 1; i <= 9; i++) {
            sum6 = sum6 + i;
            System.out.print(sum6 + " ");
        }
        System.out.println();

        // ---------- Series 7: 8 16 24 ... 80 ----------
        System.out.println("Series 7: 8 to 80 (table of 8)");
        for (int i = 8; i <= 80; i = i + 8) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 8: 0 1 1 2 3 5 8 13 21 (fibonacci) ----------
        System.out.println("Series 8: fibonacci series");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= 7; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();

        // ---------- Series 9: 1 4 9 16 ... 100 (squares) ----------
        System.out.println("Series 9: squares 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();

        // ---------- Series 10: 3 6 9 ... 30 ----------
        System.out.println("Series 10: 3 to 30 (table of 3)");
        for (int i = 3; i <= 30; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 11: 7 14 21 ... 70 ----------
        System.out.println("Series 11: 7 to 70 (table of 7)");
        for (int i = 7; i <= 70; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 12: 4 8 12 ... 40 ----------
        System.out.println("Series 12: 4 to 40 (table of 4)");
        for (int i = 4; i <= 40; i = i + 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 13: 10 20 30 ... 100 ----------
        System.out.println("Series 13: 10 to 100 (table of 10)");
        for (int i = 10; i <= 100; i = i + 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 14: 1 2 3 4 5 4 3 2 1 ----------
        System.out.println("Series 14: up and down");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        for (int i = 4; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Series 15: 6 12 18 ... 60 ----------
        System.out.println("Series 15: 6 to 60 (table of 6)");
        for (int i = 6; i <= 60; i = i + 6) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
