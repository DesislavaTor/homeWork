package homeWorks;

import java.util.Scanner;

public class MinutesToYearsDays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter minutes: ");
    long minutes = scanner.nextLong();

    long days = minutes / (60 * 24); // 60 minutes/hour * 24 hours/day

    long years = days / 365;
    long remainingDays = days % 365;

    System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    scanner.close();
  }
}
