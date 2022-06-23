package task3;

import java.util.Scanner;

public class WorkingWithFunctionalInterface {
    public void logic() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        if (result == 1) {
            System.out.println("Enter string");
            Fint<String> fint = () -> {
                String line = scanner.next();
                StringBuilder builder = new StringBuilder(line);
                System.out.println("Reversed input : " + builder.reverse());
            };
            fint.resolve();

        } else if (result == 2) {
            System.out.println("Enter number");
            Fint<Integer> fint = () -> {
                int number = scanner.nextInt();
                long res = 1L;
                for (int i = 1; i <= number; i++) {
                    res = res * i;
                }
                System.out.println("Factorial of input = " + res);
            };
            fint.resolve();
        } else System.out.println("Re-enter");
    }
}
