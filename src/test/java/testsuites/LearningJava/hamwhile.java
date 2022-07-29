package testsuites.LearningJava;

import java.util.Scanner;

public class hamwhile {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int nghiem_age = 0;
        while (nghiem_age!=23){
            System.out.println("nhap sai tuoi cua nghiem de tiep tuc");
            nghiem_age=scanner.nextInt();
        }
//        int age = 0; no scaner
//        while (age < 10){
//            System.out.println("Nghiem" + age + "Tuoi");
//            age = age + 1;
//        }
    }
}
