import java.util.Scanner;

class QuadraticEq1 {
 public static void main(String args[]) {
  Scanner myeq = new Scanner(System.in); 
  System.out.println("Enter the coefficient of a:");
  double a = myeq.nextDouble();
  System.out.println("Enter the coefficient of b:");
  double b = myeq.nextDouble();
  System.out.println("Enter the coefficient of c:");
  double c = myeq.nextDouble();

  double root1, root2;
  double d = b * b - 4 * a * c;

if (d > 0) {
    root1 = (-b + Math.sqrt(d)) / (2 * a);
    root2 = (-b - Math.sqrt(d)) / (2 * a);
    System.out.printf("root1 = %.3f and root2 = %.3f%n", root1, root2); 
        } 
else if (d == 0) {
    root1 = -b / (2 * a);
    root2 = root1;
    System.out.printf("root1 = root2 = %.2f%n", root1); 
        } 
else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);
            System.out.printf("root1 = %.2f + %.2fi%n", real, imag); 
            System.out.printf("root2 = %.2f - %.2fi%n", real, imag); 
           System.out.println("NIDHI D B");
        }
         
    }
}
