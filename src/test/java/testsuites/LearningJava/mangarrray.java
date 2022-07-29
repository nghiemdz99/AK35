package testsuites.LearningJava;

import java.util.Scanner;

public class mangarrray {
    public static void main(String[] args) {
        double mang1[];
        mang1 = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mang1.length; i++)
        mang1[i] = scanner.nextDouble();
    }
}
