package testsuites.LearningJava.quanlimaytinh;

public class hangsanxuat {
    String tenHangSanXuat;
    quocgia quocGia;

    public hangsanxuat(String tenHangSanXuat, quocgia quocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public quocgia getQuocGia() {
        return this.quocGia;
    }

    public void setQuocGia(quocgia quocGia) {
        this.quocGia = quocGia;
    }

    public String layTenQuocGia() {
        return this.getQuocGia().getTenQuocGia();
    }
}
