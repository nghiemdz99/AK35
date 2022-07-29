package testsuites.LearningJava;

import java.util.Scanner;

public class swichcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        System.out.println("nhap so nhuyen tu 0-8");
        n = scanner.nextInt();
        switch (n){
            case 2:
                System.out.println("thu 2");
                break;
            case 3:
                System.out.println("thu 3");
                break;
            case 4:
                System.out.println("thu 4");
                break;
            case 5:
                System.out.println("thu 5");
                break;
            case 6:
                System.out.println("thu 6");
                break;
            case 7:
                System.out.println("thu 7");
                break;
            case 8:
                System.out.println("Chu nhat");
                break;
            default:
                System.out.println("ngay khong hop le");
        }
    }
}
