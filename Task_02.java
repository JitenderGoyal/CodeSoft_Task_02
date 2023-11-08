// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Define a class named "Task_02"
public class Task_02 {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Print a message to the console
        System.out.println("------- Grade Calculator -------");

        // Prompt the user to enter the student's name and store it in the "studentName" variable
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // Prompt the user to enter the number of subjects and store it in the "numSubjects" variable
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize a variable "totalMarks" to keep track of the total marks
        int totalMarks = 0;

        // Use a loop to input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            // Prompt the user to enter marks for a specific subject and store it in the "marks" variable
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();

            // Add the entered marks to the totalMarks
            totalMarks += marks;
        }

        // Calculate the average percentage by dividing the total marks by (numSubjects * 100)
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Initialize a variable "grade" to store the student's grade
        String grade;

        // Determine the grade based on the average percentage
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

        // Print the results to the console
        System.out.println("------------ Results ------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------------");

        // Close the Scanner to release resources
        scanner.close();
    }
}
