// Age Calculator

import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days");
    }
}

//input //output
Enter your birthdate (yyyy-mm-dd): 2000-05-15
Your age is: 25 years, 1 months, and 25 days
v
