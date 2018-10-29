package com.springboot.pg.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.pg.model.security.User;
import com.springboot.pg.security.repository.UserRepository;

@RestController
@RequestMapping("/")
public class IndexController {
	@Autowired
	UserRepository userRepository;
	
    @GetMapping
    public String sayHello() {
        return "Hello and Welcome to the PG Rest Application "
        		+ "After Authentication you can host your PG Detail here .";
    }
    
//    @GetMapping("/notes")
//    public List<User> getAllNotes() {
//        return userRepository.findAll();
//    }
}
