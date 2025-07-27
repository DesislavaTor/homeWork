package homeWorks;

public class ThirdTask {
  public static void main(String[] args) {
    double side1 = 3.0;
    double side2 = 4.0;
    double side3 = 5.0;

    double semiPerimeter = (side1 + side2 + side3) / 2;

    double area = Math.sqrt(semiPerimeter *
        (semiPerimeter - side1) *
        (semiPerimeter - side2) *
        (semiPerimeter - side3));

    System.out.println("The area of the triangle is: " + area);
  }
}
