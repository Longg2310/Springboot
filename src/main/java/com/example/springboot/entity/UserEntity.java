package com.example.springboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "user", schema = "java2202", catalog = "")
public class UserEntity {
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USER_NAME")
    private String userName;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "FULL_NAME")
    private String fullName;
    @Basic
    @Column(name = "RETYPE_PASSWORD")
    private String retypePassword;
}
