package homeWorks;

import java.util.Scanner;

public class fineTuneTwoAndThree {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the side A in cm: ");
    int sideA = scanner.nextInt();
    System.out.print("Enter the side B in cm: ");
    int sideB = scanner.nextInt();
    System.out.print("Enter the side C in cm: ");
    int sideC = scanner.nextInt();
    int perimeter = sideA + sideB + sideC;
    int semiPerimeter = perimeter / 2;
    double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

    System.out.println("The perimeter of the triangle is: " + perimeter);
    System.out.println("The area of the triangle is: " + area);
    scanner.close();


  }
}
