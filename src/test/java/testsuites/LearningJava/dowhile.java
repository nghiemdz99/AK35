package testsuites.LearningJava;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Nhap so may man cua ban : ");
            x = scanner.nextInt();

        }while (x > 5);
    }
}
