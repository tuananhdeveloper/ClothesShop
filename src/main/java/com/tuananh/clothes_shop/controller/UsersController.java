package com.tuananh.clothes_shop.controller;
import com.tuananh.clothes_shop.common.Status;
import com.tuananh.clothes_shop.model.ShoppingCart;
import com.tuananh.clothes_shop.model.Users;
import com.tuananh.clothes_shop.repository.ShoppingCartRepository;
import com.tuananh.clothes_shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class UsersController {
    @Autowired
    private UserRepository userRepo;

    @CrossOrigin
    @PostMapping(value = "/users/register",  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> processRegister(@RequestBody Users user) {
        List<Users> users = userRepo.findAll();
        for (Users u : users) {
            if (u.getLoginId().equals(user.getLoginId())) {
                return new ResponseEntity<Object>(Status.USER_ALREADY_EXISTS, HttpStatus.OK);
            }
        }

//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
        userRepo.save(user);
        return new ResponseEntity<Object>(Status.SUCCESS, HttpStatus.CREATED);
    }

    @CrossOrigin
    @PostMapping(value = "/users/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> loginUser(@Valid @RequestBody Users user) {
        List<Users> users = userRepo.findAll();
        for (Users other : users) {
            if (other.getLoginId().equals(user.getLoginId()) && other.getPassword().equals(user.getPassword())) {
                return new ResponseEntity<Object>(userRepo.getUserInfo(user.getLoginId()), HttpStatus.OK);
            }
        }
        return new ResponseEntity<Object>(Status.FAILURE, HttpStatus.OK);
    }

}
