package testsuites.LearningJava;

public class method {
    public static void main(String[] args) {
        count(5,10);
        count(50,50);
        System.out.println(tongTien(10.000,20.000));
    }
    public static void count(int a, int b){
        System.out.println("a + b = : " + (a + b));
    }
    public static double tongTien(double tiendien, double tiennuoc){
        return tiendien+tiennuoc;
    }
}
