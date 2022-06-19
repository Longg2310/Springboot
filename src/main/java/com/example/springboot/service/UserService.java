package com.example.springboot.service;

import com.example.springboot.dto.UserDto;
import com.example.springboot.entity.UserEntity;
import com.example.springboot.exception.DemoException;
import com.example.springboot.repositoory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUserService(@RequestBody UserDto userDto) throws SQLException {
        if(userDto.getUserName().equals("abc")) {
            throw new DemoException();
        }
        UserEntity user = new UserEntity();
        user.setUserName(userDto.getUserName());
        user.setFullName(userDto.getFullName());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
    }
    public List<UserEntity> getinfos(String name) throws SQLException{
        List<UserEntity> infos = userRepository.getinfos(name);
        infos.get(0);
        return infos;
    }
}
