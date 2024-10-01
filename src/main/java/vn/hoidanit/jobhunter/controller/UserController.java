package vn.hoidanit.jobhunter.controller;

import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.jobhunter.domain.User;
import vn.hoidanit.jobhunter.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/create")
    public String createNewUser() {
        User user = new User();

        user.setEmail("ahahaa@gmail.com");
        user.setPassword("sssssss");
        user.setName("Hahah");

        this.userService.saveUser(user);

        return "Create user";
    }

}
