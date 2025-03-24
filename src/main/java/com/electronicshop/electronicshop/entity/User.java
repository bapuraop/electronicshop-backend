package com.electronicshop.electronicshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "users")
public class User {

    @Id
    private String userid;
    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email",unique = true)
    private String email;

    @Column(name = "user_password", length = 10)
    private String password;
    private String gender;

    @Column(length = 100)
    private String about;

    @Column(name = "user_imagename")

    private String imageName;
}
