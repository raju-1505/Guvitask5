// strings into uppercase

import java.util.*;
import java.util.stream.*;

public class Uppercase {
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


        List<String> upperCaseList = inputList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Strings: " + upperCaseList);
    }
}

//input//output

Enter the number of strings: 2
Enter 2 strings:
gf5'
yf
Uppercase Strings: [GF5', YF]
