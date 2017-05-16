package entities;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class PhieuNhapHang {
    public String mMaPhieuNhap;
    public String mMaNhaCungCap;
    public String mTenNhaCungCap;
    public int mTongTien;
    public int mGiaGiam;
    public int mTienDaTra;
    public int mCongNo;
    public int mThoiGian;
    public String mGhiChu;
    
    public PhieuNhapHang(){}
    public PhieuNhapHang(String maPhieuNhap,String maNhaCungCap, String tenNhaCungCap,
            int tongTien, int giaGiam, int tienDaTra, int congNo, int thoiGian, String ghiChu){
        
        this.mMaPhieuNhap = maPhieuNhap;
        this.mMaNhaCungCap = maNhaCungCap;
        this.mTenNhaCungCap = tenNhaCungCap;
        this.mTongTien = tongTien;
        this.mGiaGiam = giaGiam;
        this.mTienDaTra = tienDaTra;
        this.mCongNo = congNo;
        this.mThoiGian = thoiGian;
        this.mGhiChu = ghiChu;
    }
    }
