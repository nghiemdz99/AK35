package testsuites.LearningJava;

public class Arrray {
    public static void main(String[] args) {
        int valies[];
        valies = new int[5];
        valies[0] = 0;
        valies[1] = 10;
        valies[2] = 20;
        valies[3] = 30;
        valies[4] = 40;
//        System.out.println(valies[0]);
//        System.out.println(valies[1]);
//        System.out.println(valies[2]);
//        System.out.println(valies[3]);
//        System.out.println(valies[4]);
//        for (int i = 1; i < valies.length;i++){
//            System.out.println(valies[i]);
//        }
        int[] numbers = {1,2,4,6};
        int tong = 0;

        for (int i = 0; i < numbers.length;i++){
            tong+= numbers.length;
        }
        System.out.println("Tong : " + tong);
    }
}
