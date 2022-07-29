package testsuites.LearningJava.quanlisach;

public class sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    public tacGia tacG;

    public sach(String tenSach, double giaBan, int namXuatBan, tacGia tacG) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacG = tacG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public tacGia getTacG() {
        return tacG;
    }

    public void setTacG(tacGia tacG) {
        this.tacG = tacG;
    }
    public void inTenSach(){
        System.out.println(tenSach);
    }
    public boolean checkCungNamXuatBan(sach sachKhac){
//        if (this.namXuatBan==sachKhac.namXuatBan){
//            return true;
//        }else {
//            return false;
//        }
        return this.namXuatBan == sachKhac.namXuatBan;
    }
    public double giaSauKhiGiam(double x){
        return this.giaBan*(1-x/100);
    }
}
