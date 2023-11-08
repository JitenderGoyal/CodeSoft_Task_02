import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------- Grade Calculator -------");

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        System.out.println();  // Add a one-line space

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        String[] subjectNames = new String[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();  // Read subject names with spaces
        }

        System.out.println();  // Add a one-line space

        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in " + subjectNames[i] + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
            if (i < numSubjects - 1) {
                scanner.nextLine();  // Consume the newline character
            }
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("------------ Results ------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------------");

        scanner.close();
    }
}
