import java.util.Scanner;

class StudentResult {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int marks;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100");
                i--;   
                continue;
            }

            total += marks;
        }

        double percentage = total / 5.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        // Result & Grade
        if (percentage >= 40) {
            System.out.println("Result: PASS");

            if (percentage >= 90)
                System.out.println("Grade: A+");
            else if (percentage >= 75)
                System.out.println("Grade: A");
            else if (percentage >= 60)
                System.out.println("Grade: B");
            else
                System.out.println("Grade: C");

        } else {
            System.out.println("Result: FAIL");
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
