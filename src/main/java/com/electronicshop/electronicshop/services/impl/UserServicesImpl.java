package com.electronicshop.electronicshop.services.impl;

import com.electronicshop.electronicshop.dtos.UserDto;
import com.electronicshop.electronicshop.repositories.UserRepositories;
import com.electronicshop.electronicshop.repositories.userRepositories;
import com.electronicshop.electronicshop.services.userServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements userServices {

    @Autowired
    private UserRepositories userRepositories;


    @Override

    public UserDto CtreteUser(UserDto userDto) {
        User user = dtotoEntity(userDto);
        userRepositories.save(user);
//        User saveuser= UserRepositories.save(user);
//
//        UserDto saveuserDto = entityToDto(saveuser);
//
//        return saveuserDto;
        return null;
    }

//    private Object entityToDto(User saveuser) {
//        return null;
//    }
//
//    private User dtotoEntity(UserDto user) {
//        return null;
//    }

    @Override
    public UserDto updateUser(UserDto userDto, String userid) {
        return null;
    }

    @Override
    public void deleteuser(String userid) {

    }

    @Override
    public List<UserDto> getalluser() {
        return null;
    }

    @Override
    public UserDto getalluserbyId(String userId) {
        return null;
    }

    @Override
    public UserDto getalluserbymail(String email) {
        return null;
    }

    @Override
    public List<UserDto> searchUser(String Keyword) {
        return null;
    }
}
