package com.example.springboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "nhanvien", schema = "java2202", catalog = "")
public class NhanvienEntity {
    private String manv;
    private String hoten;
    private String sdt;
    private Timestamp ngvl;

    @Id
    @Column(name = "MANV")
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
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
    @Column(name = "SDT")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "NGVL")
    public Timestamp getNgvl() {
        return ngvl;
    }

    public void setNgvl(Timestamp ngvl) {
        this.ngvl = ngvl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanvienEntity that = (NhanvienEntity) o;
        return Objects.equals(manv, that.manv) &&
                Objects.equals(hoten, that.hoten) &&
                Objects.equals(sdt, that.sdt) &&
                Objects.equals(ngvl, that.ngvl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manv, hoten, sdt, ngvl);
    }
}
