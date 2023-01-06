package ss5;

import ss2.HotGirl;

public class HocSinh {
    String ten;

    String ngaysinh;

    String diachi;

    String tenlophoc;

    String diemtrungbinh;

    public HocSinh() {
    }

    public HocSinh(String ten, String ngaysinh, String diachi, String tenlophoc, String diemtrungbinh) {
            this.ten = ten;
            this.ngaysinh = ngaysinh;
            this.diachi = diachi;
            this.tenlophoc = tenlophoc;
            this.diemtrungbinh = diemtrungbinh;
        }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTenlophoc() {
        return tenlophoc;
    }

    public void setTenlophoc(String tenlophoc) {
        this.tenlophoc = tenlophoc;
    }

    public String getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(String diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }
}
