package com.example.springboot.controller;

import com.example.springboot.entity.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RestController
public class TargetController {
    @GetMapping("news/get")
    public List<News> getabc (@PathParam("id") String id){
        News news1 = new News();
        News news2 = new News();
        news1.setTitle("new1title");
        news1.setContent("new1content");
        news2.setTitle("new2title");
        news2.setContent("new2content");
        System.out.println(id);
        return Arrays.asList(news1, news2);
    }
}
