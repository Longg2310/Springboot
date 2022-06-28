package com.example.springboot.controller;

import com.example.springboot.dto.UserDto;
import com.example.springboot.entity.News;
import com.example.springboot.entity.UserEntity;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.*;

@RestController
@RequestMapping("user")
public class UserController {

    private final String URL_News = "http://localhost:8080/news/get";
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("news")
    public List<News> getnews(){
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(URL_News)
                // Add query parameter
                .queryParam("id", "1");

        News[] newsArray = restTemplate.getForObject(builder.buildAndExpand().toUriString(), News[].class);
        return Arrays.asList(newsArray);
    }

    @GetMapping("getinfo")
    public List<String> getInfo(@RequestParam String name) throws SQLException {
        List<UserEntity> infos = userService.getinfos(name);
        System.out.println("aaa" + infos);
        List<String> getinfo = new ArrayList<>();
        getinfo.add(String.valueOf(infos.get(0).getId()));
        getinfo.add(infos.get(0).getUserName());
        getinfo.add(infos.get(0).getPassword());
        getinfo.add(infos.get(0).getFullName());
        System.out.println( "SẠHDJMSAHGDJSAGHDJ");
        return getinfo;
    }

    @PostMapping("create")
    public String createUser(
            @Valid @RequestBody UserDto userDto,
            BindingResult bindingResult
    ) throws SQLException {
        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        else{
            userService.createUserService(userDto);
            return "Success";
        }
    }

//    @PutMapping("user/update")
//    public UserDto updateUser(@RequestBody UserDto userDto) throws SQLException {
//        StringBuilder sql = new StringBuilder();
//        sql.append("UPDATE USER SET ");
//        sql.append("USER_NAME = '").append(userDto.getUserName());
//        sql.append("', PASSWORD = '").append(userDto.getPassword());
//        sql.append("', FULL_NAME = '").append(userDto.getUserName());
//        sql.append("' Where ID = ").append(userDto.getID());
//        DBUtils.create(sql.toString());
//        return userDto;
//    }
//
//    @DeleteMapping("user/delete")
//    public UserDto deleteUser(@RequestBody UserDto userDto) throws SQLException {
//        StringBuilder sql = new StringBuilder();
//        sql.append("DELETE FROM USER ");
//        sql.append(" Where ID = ").append(userDto.getID());
//        DBUtils.create(sql.toString());
//        return userDto;
//    }
}
