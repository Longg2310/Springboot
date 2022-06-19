package com.example.springboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hoadon", schema = "java2202", catalog = "")
public class HoadonEntity {
    private int sohd;
    private Timestamp nghd;
    private String makh;
    private String manv;
    private Double trigia;

    @Id
    @Column(name = "SOHD")
    public int getSohd() {
        return sohd;
    }

    public void setSohd(int sohd) {
        this.sohd = sohd;
    }

    @Basic
    @Column(name = "NGHD")
    public Timestamp getNghd() {
        return nghd;
    }

    public void setNghd(Timestamp nghd) {
        this.nghd = nghd;
    }

    @Basic
    @Column(name = "MAKH")
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    @Basic
    @Column(name = "MANV")
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    @Basic
    @Column(name = "TRIGIA")
    public Double getTrigia() {
        return trigia;
    }

    public void setTrigia(Double trigia) {
        this.trigia = trigia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoadonEntity that = (HoadonEntity) o;
        return sohd == that.sohd &&
                Objects.equals(nghd, that.nghd) &&
                Objects.equals(makh, that.makh) &&
                Objects.equals(manv, that.manv) &&
                Objects.equals(trigia, that.trigia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sohd, nghd, makh, manv, trigia);
    }
}
