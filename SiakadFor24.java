import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade;
        double highest = 10;
        double lowest = 100;
        int pass = 0;
        int fail = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the grade of the " + i + "student: ");
            grade = sc.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }
        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
        System.out.println("students passed: " + pass);
        System.out.println("students failed: " + fail);
        sc.close();
    }

}