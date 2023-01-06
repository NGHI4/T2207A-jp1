package ss5;

public class HocSinh {
    String ten;

    String ngaysinh;

    String diachi;

    String tenlophoc;

    double diemtrungbinh;

    public HocSinh(String ten,String ngaysinh,String tenlophoc, String diachi, double diemtrungbinh){
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.tenlophoc = tenlophoc;
        this.diemtrungbinh = diemtrungbinh;
    }

    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public void setNgaysinh(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public String getDiachi(){
        return diachi;
    }
    public void setDiachi(String diachi){
        this.diachi = diachi;
    }
    public String getTenlophoc(){
        return tenlophoc;
    }
    public void setTenlophoc(String tenlophoc){
        this.tenlophoc = tenlophoc;
    }
    public double getDiemtrungbinh(){
        return diemtrungbinh;
    }
    public void setDiemtrungbinh(double diemtrungbinh){
        diemtrungbinh = diemtrungbinh;
    }
    public void baoCaoKetQua(){
        if(diemtrungbinh < 4){
            System.out.println("Yeu");
        }else if(diemtrungbinh < 6.5){
            System.out.println("Trung Binh");
        }else if(diemtrungbinh < 8){
            System.out.println("Kha");
        }else if(diemtrungbinh < 9.5){
            System.out.println("Gioi");
        }else{
            System.out.println("Xuat Sac");
        }
    }

    public void inThongTin(){
        System.out.println("Ho ten:" +ten);
        System.out.println("Ngay Sinh:" +ngaysinh);
        System.out.println("Dia Chi:" +diachi);
        System.out.println("Lop Hoc:" +tenlophoc);
        System.out.println("Diem TB:" +diemtrungbinh);
    }
}