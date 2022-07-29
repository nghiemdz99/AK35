package testsuites.LearningJava.quanlimaytinh;

public class Test {


    public static void main(String[] args) {

        ngay ngay1 = new ngay(19,06,1999);
        ngay ngay2 = new ngay(02,04,2000);
        ngay ngay3 = new ngay(19,10,2003);
        quocgia quocgia1 = new quocgia("001","Vietnam");
        quocgia quocgia2 = new quocgia("002","JAPAN");
        quocgia quocgia3 = new quocgia("003","UK");
        hangsanxuat hangsanxuat1 = new hangsanxuat("KFC",quocgia1);
        hangsanxuat hangsanxuat2 = new hangsanxuat("Hamburger",quocgia2);
        hangsanxuat hangsanxuat3 = new hangsanxuat("Tiger",quocgia3);
        maytinh maytinh1 = new maytinh(hangsanxuat1,ngay1,20.000,1.5);
        maytinh maytinh2 = new maytinh(hangsanxuat2,ngay2,50.000,1.5);
        maytinh maytinh3 = new maytinh(hangsanxuat3,ngay3,50.000,1.5);
        System.out.println("kiem tra gia may tinh 1 thap hon may tinh 2 : " + maytinh1.kiemTraGiaThapHon(maytinh2));
        System.out.println("kiem tra gia may tinh 3 thap hon may tinh 1 : " + maytinh3.kiemTraGiaThapHon(maytinh1));
        System.out.println("Ten quoc gia 1 la : " + maytinh1.layTenQuocGia());
        System.out.println("Ten quoc gia 2 la : " + maytinh2.layTenQuocGia());
        System.out.println("Ten quoc gia 3 la : " + maytinh3.layTenQuocGia());





    }
}
