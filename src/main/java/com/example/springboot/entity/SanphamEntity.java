package com.example.springboot.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sanpham", schema = "java2202", catalog = "")
public class SanphamEntity {
    private String masp;
    private String tensp;
    private String dvt;
    private String nuocsx;
    private Double gia;

    @Id
    @Column(name = "MASP")
    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    @Basic
    @Column(name = "TENSP")
    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    @Basic
    @Column(name = "DVT")
    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    @Basic
    @Column(name = "NUOCSX")
    public String getNuocsx() {
        return nuocsx;
    }

    public void setNuocsx(String nuocsx) {
        this.nuocsx = nuocsx;
    }

    @Basic
    @Column(name = "GIA")
    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanphamEntity that = (SanphamEntity) o;
        return Objects.equals(masp, that.masp) &&
                Objects.equals(tensp, that.tensp) &&
                Objects.equals(dvt, that.dvt) &&
                Objects.equals(nuocsx, that.nuocsx) &&
                Objects.equals(gia, that.gia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masp, tensp, dvt, nuocsx, gia);
    }
}
