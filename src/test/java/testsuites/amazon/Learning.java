package testsuites.amazon;

import java.util.Scanner;

public class Learning {
    public static void main(String args[]) {
        int days = 5;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Roi vao ngay cuoi tuan");
            days = sc.nextInt();
        }
        while (days > 5);

//        int x = 50;
//        Scanner sc = new Scanner(System.in);
//        while (x <= 50){
//            System.out.println("Nhap be hon 50 de thoat");
//            x = sc.nextInt();
//        }
//        for (int i = 2; i <9;i++){
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + "x" + j + "=" + (i *j));
//            }
//        }
//        int i = 0;
//        int x = 5;

//        if (i > 10){
//            System.out.println("i con hon 10");
//        }
//        else if (i == 0){
//            System.out.println("i bang nhau");
//        }
//        else {
//            System.out.println("i nho hon");
//        }
//        for (int i = 0; i <= 5; i++){
//            System.out.println(i);
//        }
//        for (int j = 4; j >= i; i-- ){
//            System.out.println(j);
//        }
//        int arrr[] = {10,20,30,40,50};
//        for (int i : arrr){
//            System.out.println(i);
//        }
    }
}
