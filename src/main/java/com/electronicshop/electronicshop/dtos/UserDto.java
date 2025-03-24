package com.electronicshop.electronicshop.dtos;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {

    private String userid;
    private String name;

    private String email;

    private String password;
    private String gender;

    private String about;


    private String imageName;
}
