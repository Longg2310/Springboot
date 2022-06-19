package com.example.springboot.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cthd", schema = "java2202", catalog = "")
public class CthdEntity {
    private int sohd;
    private String masp;
    private Integer sl;
    private long id;

    @Basic
    @Column(name = "SOHD")
    public int getSohd() {
        return sohd;
    }

    public void setSohd(int sohd) {
        this.sohd = sohd;
    }

    @Basic
    @Column(name = "MASP")
    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    @Basic
    @Column(name = "SL")
    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    @Id
    @Basic
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CthdEntity that = (CthdEntity) o;
        return sohd == that.sohd &&
                id == that.id &&
                Objects.equals(masp, that.masp) &&
                Objects.equals(sl, that.sl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sohd, masp, sl, id);
    }
}
