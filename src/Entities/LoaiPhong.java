/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author you have to better
 */
public class LoaiPhong {

    int MaLP;
    String TenLP;
    int SoGiuong;
    double giaPhong;

    public LoaiPhong() {
    }

    public LoaiPhong(int MaLP, String TenLP, int SoGiuong, double giaPhong) {
        this.MaLP = MaLP;
        this.TenLP = TenLP;
        this.SoGiuong = SoGiuong;
        this.giaPhong = giaPhong;
    }

    public int getMaLP() {
        return MaLP;
    }

    public void setMaLP(int MaLP) {
        this.MaLP = MaLP;
    }

    public String getTenLP() {
        return TenLP;
    }

    public void setTenLP(String TenLP) {
        this.TenLP = TenLP;
    }

    public int getSoGiuong() {
        return SoGiuong;
    }

    public void setSoGiuong(int SoGiuong) {
        this.SoGiuong = SoGiuong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    
}
