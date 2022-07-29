package testsuites.LearningJava.quanlisach;

public class Test {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(10,1,2022);
        ngay ngay2 = new ngay(20,2,2022);
        ngay ngay3 = new ngay(30,3,2022);

        tacGia tacgia1 = new tacGia("nghiem",ngay1);
        tacGia tacgia2 = new tacGia("user1",ngay2);
        tacGia tacgia3 = new tacGia("user2",ngay3);

        sach sach1 = new sach("Selenium Book 01",20.000,2022,tacgia1);
        sach sach2 = new sach("Selenium Book 02",40.000,2022,tacgia2);
        sach sach3 = new sach("Selenium Book 03",60.000,2022,tacgia3);
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        System.out.println("so sanh NXB "+ sach1.checkCungNamXuatBan(sach2));
        System.out.println("Sach 1 giam 10%: " + sach1.giaSauKhiGiam(10));
        System.out.println("Sach 2 giam 50%: " + sach2.giaSauKhiGiam(50));
        System.out.println("Sach 3 giam 100%: " + sach3.giaSauKhiGiam(100));
    }

}
