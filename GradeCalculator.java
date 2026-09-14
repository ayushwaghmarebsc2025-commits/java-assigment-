import java.util.Scanner;

// Simple program to calculate grade based on exam score
// Uses if-else statements as learned in class
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the exam score: ");
        int score = sc.nextInt();

        String grade;

        // checking the score using if-else ladder
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("The grade is " + grade + ".");

        sc.close();
    }
}
