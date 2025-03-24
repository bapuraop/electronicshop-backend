package com.electronicshop.electronicshop.services;

import com.electronicshop.electronicshop.dtos.UserDto;
import org.apache.catalina.User;

import java.util.List;

public interface userServices {

    UserDto CtreteUser(UserDto user);

    UserDto updateUser(UserDto userDto,String userid);

    void deleteuser(String userid);

    List<UserDto> getalluser();

    UserDto getalluserbyId(String userId);

    UserDto getalluserbymail(String email);

    List<UserDto> searchUser(String Keyword);




}
