import java.util.Scanner;

class Stud_details {
    int marks[] = new int[3];  // Marks for 3 subjects
    String usn, name;

    // Credit points for the 3 subjects: 4 credits, 3 credits, 2 credits
    int creditPoints[] = {4, 3, 2}; 
    int gradePoints[] = new int[3]; // To store grade points for the 3 subjects
    Scanner sc = new Scanner(System.in);

    void getdetails() {
        System.out.print("Enter USN: ");
        usn = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
            gradePoints[i] = calculateGradePoint(marks[i]); // Convert marks to grade points
        }
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks of subject " + (i + 1) + ": " + marks[i] + " (Grade Point: " + gradePoints[i] + ")");
        }
        calculateSGPA(); // Call SGPA calculation
    }

    int calculateGradePoint(int marks) {
        if (marks >= 90) return 10; // O grade
        else if (marks >= 80) return 9; // A+ grade
        else if (marks >= 70) return 8; // A grade
        else if (marks >= 60) return 7; // B+ grade
        else if (marks >= 55) return 6; // B grade
        else if (marks >= 50) return 5; // C grade
        else if (marks >= 40) return 4; // P grade
        else return 0; // F grade
    }

    void calculateSGPA() {
        int totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < 3; i++) {
            totalGradePoints += gradePoints[i] * creditPoints[i]; // Multiply grade point with credit
            totalCredits += creditPoints[i]; // Sum the total credits
        }

        double sgpa = (double) totalGradePoints / totalCredits; // SGPA calculation
        System.out.println("SGPA: " + sgpa);
    }
}

class Student_details {
    public static void main(String args[]) {
        Stud_details s1[] = new Stud_details[3]; // Array of 3 students

        for (int j = 0; j < 3; j++) {
            s1[j] = new Stud_details(); // Initialize each student object
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Enter details for student " + (j + 1) + ":");
            s1[j].getdetails();
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("\nDetails of student " + (j + 1) + ":");
            s1[j].display();
            System.out.println("NIDHI D B");
            
        }
    }
}
