package com.cinema_package.cinema_project.user;

import com.cinema_package.cinema_project.CinemaProjectApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public void signup(@RequestBody CinemaProjectApplication.UsersRequest user) {
        userService.addUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody CinemaProjectApplication.LoginRequest user) throws Exception {
        return userService.login(user);
    }

}