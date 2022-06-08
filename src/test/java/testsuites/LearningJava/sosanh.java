package testsuites.LearningJava;

import java.util.Scanner;

public class sosanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap so a");
        a = scanner.nextInt();
        System.out.println("Nhap so b");
        b = scanner.nextInt();
        System.out.println(a + " == "+ b + (a==b));
        System.out.println(a + " != "+ b + (a!=b));
        System.out.println(a + " <= "+ b + (a<=b));
        System.out.println(a + " >= "+ b + (a>=b));
        System.out.println(a + " < "+ b + (a<b));
        System.out.println(a + " > "+ b + (a>b));


    }
}
