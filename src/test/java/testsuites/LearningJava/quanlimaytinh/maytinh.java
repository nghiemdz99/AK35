package testsuites.LearningJava.quanlimaytinh;

public class maytinh {
    hangsanxuat hangSuanXuat;
    ngay ngaySanXuat;
    double giaBan;
    double thoiGianBaoHanh;

    public maytinh(hangsanxuat hangSuanXuat, ngay ngaySanXuat, double giaBan, double thoiGianBaoHanh) {
        this.hangSuanXuat = hangSuanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public hangsanxuat getHangSuanXuat() {
        return hangSuanXuat;
    }

    public void setHangSuanXuat(hangsanxuat hangSuanXuat) {
        this.hangSuanXuat = hangSuanXuat;
    }

    public ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public boolean kiemTraGiaThapHon(maytinh maytinhkhac){
        return this.giaBan < maytinhkhac.giaBan;
    }
    public String layTenQuocGia(){
        return this.hangSuanXuat.layTenQuocGia();
    }
}
