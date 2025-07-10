// special gift whose name start wiht 'A'

import java.util.*;
import java.util.Scanner;
import java.util.stream.*;

public class SpecialGift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> studentNames = new ArrayList<>();
        System.out.println("Enter " + n + " student names:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        List<String> aNames = studentNames.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Students whose names start with 'A': " + aNames);
    }
}

//input //output

Enter the number of students: 7
Enter 7 student names:
raju
ajith
aravind
kali
ammiu
ajeesh
ak
Students whose names start with 'A': [ajith, aravind, ammiu, ajeesh, ak]

