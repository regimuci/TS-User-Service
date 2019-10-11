package TS.User.controllers;

import TS.User.entities.Group;
import TS.User.entities.User;
import TS.User.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping("/changePassword")
    public ResponseEntity<Object> changePassword(Authentication authentication,
                                                 @RequestParam String oldPassword,
                                                 @RequestParam String newPassword){
        String email = authentication.getName();
        User user = userService.findUser(email);
        userService.changePassword(user,oldPassword,newPassword);
        return new ResponseEntity<Object>("Password changed successfully",HttpStatus.OK);
    }

    @GetMapping("/findGroupsForUserWhereRoleAdmin")
    public ResponseEntity<List<Group>> findGroupsForUserWhereAdmin(Authentication authentication){
        String email = authentication.getName();
        User user = userService.findUser(email);
        List<Group> groups = userService.findGroupsForUserWhereAdmin(user);
        return new ResponseEntity<List<Group>>(groups,HttpStatus.OK);
    }

    @GetMapping("/findGroupsForUserWhereRoleUser")
    public ResponseEntity<List<Group>> findGroupsForUserWhereUser(Authentication authentication){
        String email = authentication.getName();
        User user = userService.findUser(email);
        List<Group> groups = userService.findGroupsForUserWhereUser(user);
        return new ResponseEntity<List<Group>>(groups,HttpStatus.OK);
    }
}
