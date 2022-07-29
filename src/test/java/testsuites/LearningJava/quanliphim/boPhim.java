package testsuites.LearningJava.quanliphim;

public class boPhim {
    private String tenPhim;
    private int namSanXuat;
    private hangSanXuat hangSanXuatt;
    private double giaVe;
    private ngay ngaychieu;

    public boPhim(String tenPhim, int namSanXuat, hangSanXuat hangSanXuatt, double giaVe, ngay ngaychieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuatt = hangSanXuatt;
        this.giaVe = giaVe;
        this.ngaychieu = ngaychieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public hangSanXuat getHangSanXuatt() {
        return hangSanXuatt;
    }

    public void setHangSanXuatt(hangSanXuat hangSanXuatt) {
        this.hangSanXuatt = hangSanXuatt;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public ngay getNgaychieu() {
        return ngaychieu;
    }

    public void setNgaychieu(ngay ngaychieu) {
        this.ngaychieu = ngaychieu;
    }

    public boolean kiemTraGiaVeReHon(boPhim phimKhac){
        return this.giaVe < phimKhac.giaVe;

    }
    public String LayTenHangSanXuat(){
        return this.hangSanXuatt.getTenHangSanXuat();
    }
    public double giaSauKhiKhuyenMai(double x){
        return this.giaVe*(1-x/100);
    }
}
