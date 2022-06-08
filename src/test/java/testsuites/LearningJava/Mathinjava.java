package testsuites.LearningJava;

import java.util.Scanner;

public class Mathinjava {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a");
        a = scanner.nextInt();
        System.out.println("nhap so b");
        b = scanner.nextInt();
        System.out.println("min cua a ,b" + Math.min(a,b));
        System.out.println("maxx cua a ,b" + Math.max(a,b));
        // celi lam tron so khi nhap
        System.out.println("maxx cua a ,b" + Math.max(a,b));

    }
}
