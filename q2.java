//print nonempty strings

import java.util.*;
import java.util.Scanner;
import java.util.stream.*;


public class NonEmptyStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> inputList = new ArrayList<>();

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            inputList.add(input);
        }


        List<String> nonEmptyList = inputList.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Non-empty strings: " + nonEmptyList);
    }
}

//input //ouput
Enter the number of strings: 5
Enter 5 strings:
raju

thiyagu

dinesh
Non-empty strings: [raju, thiyagu, dinesh]

