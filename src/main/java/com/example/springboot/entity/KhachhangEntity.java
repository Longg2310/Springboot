package com.example.springboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "khachhang", schema = "java2202", catalog = "")
public class KhachhangEntity {
    private String makh;
    private String hoten;
    private String dchi;
    private String sodt;
    private Timestamp ngsinh;
    private Timestamp ngdk;
    private Double doanhso;

    @Id
    @Column(name = "MAKH")
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    @Basic
    @Column(name = "HOTEN")
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Basic
    @Column(name = "DCHI")
    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    @Basic
    @Column(name = "SODT")
    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    @Basic
    @Column(name = "NGSINH")
    public Timestamp getNgsinh() {
        return ngsinh;
    }

    public void setNgsinh(Timestamp ngsinh) {
        this.ngsinh = ngsinh;
    }

    @Basic
    @Column(name = "NGDK")
    public Timestamp getNgdk() {
        return ngdk;
    }

    public void setNgdk(Timestamp ngdk) {
        this.ngdk = ngdk;
    }

    @Basic
    @Column(name = "DOANHSO")
    public Double getDoanhso() {
        return doanhso;
    }

    public void setDoanhso(Double doanhso) {
        this.doanhso = doanhso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhachhangEntity that = (KhachhangEntity) o;
        return Objects.equals(makh, that.makh) &&
                Objects.equals(hoten, that.hoten) &&
                Objects.equals(dchi, that.dchi) &&
                Objects.equals(sodt, that.sodt) &&
                Objects.equals(ngsinh, that.ngsinh) &&
                Objects.equals(ngdk, that.ngdk) &&
                Objects.equals(doanhso, that.doanhso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(makh, hoten, dchi, sodt, ngsinh, ngdk, doanhso);
    }
}
