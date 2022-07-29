package testsuites.LearningJava.quanliphim;

public class Test {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(20,1,2022);
        ngay ngay2 = new ngay(30,2,2022);
        ngay ngay3 = new ngay(10,3,2022);
        ngay ngay4 = new ngay(5,4,2022);
        hangSanXuat hangSanXuat1 = new hangSanXuat("NghiemTruong","VN");
        hangSanXuat hangSanXuat2 = new hangSanXuat("NghiemTruong","VN");
        hangSanXuat hangSanXuat3 = new hangSanXuat("NghiemTruong","VN");
        hangSanXuat hangSanXuat4 = new hangSanXuat("NghiemTruong","VN");
        boPhim boPhim1 = new boPhim("HoaVangTrenCoXanh",2020,hangSanXuat1,100.000,ngay1);
        boPhim boPhim2 = new boPhim("Doreamon",2020,hangSanXuat2,200.000,ngay2);
        boPhim boPhim3 = new boPhim("Tom & Jery",2020,hangSanXuat3,500.000,ngay3);
        boPhim boPhim4 = new boPhim("TayDuKi",2020,hangSanXuat4,400.000,ngay4);
        System.out.println("Kiem Tra Gia ve bo phim 1 re hon bo phim 2: " + boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println("Kiem Tra Gia ve bo phim 1 re hon bo phim 2: " + boPhim3.kiemTraGiaVeReHon(boPhim4));
        System.out.println("Kiem Tra  Hang Sx phim 1" + boPhim1.getTenPhim());
        System.out.println("Kiem Gia Gia Sau Khi KhUYEN mAI" + boPhim1.giaSauKhiKhuyenMai(10));



    }
}
