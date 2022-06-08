package testsuites.LearningJava;

import java.util.Scanner;

public class toantudieukien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        int a = scanner.nextInt();
        String KETQUA = (a%2==0)?"sochan":"sole";
        System.out.println(a + "la" + KETQUA);
    }
}
