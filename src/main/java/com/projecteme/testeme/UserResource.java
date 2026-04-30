package com.projecteme.testeme;

import com.projecteme.testeme.User.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getAllUsers(){
        User user = new User(1L,"Maria", "maria@gmail.com", "9999999", "");

        return ResponseEntity.ok().body(user);
    }
}

