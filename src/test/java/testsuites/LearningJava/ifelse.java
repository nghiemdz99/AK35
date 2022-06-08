package testsuites.LearningJava;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("nhap so a");
        a = scanner.nextInt();
        if (a%2==0){
            System.out.println("so chan");
        }else {
            System.out.println("sole");
        }
    }
}
