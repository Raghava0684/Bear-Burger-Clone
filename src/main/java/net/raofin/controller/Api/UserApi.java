package net.raofin.controller.Api;

import net.raofin.model.User;
import net.raofin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class UserApi
{
    private final UserService userService;

    public UserApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/fetchAllUsers")
    List<User> fetchUsersByUsers() {
        return userService.fetchAllUsers();
    }

    @GetMapping("/fetchUserByUsername/{username}")
    User fetchUserByUsers(@PathVariable String username) {
        return userService.fetchUserByUsername(username);
    }

    @GetMapping("/fetchUserById/{id}")
    User fetchUserById(@PathVariable String id) {
        return userService.fetchUserById(Integer.parseInt(id));
    }

    @GetMapping("/deleteUserByUsername/{username}")
    void deleteUserByUsername(@PathVariable String username) {
        userService.deleteUser(username);
    }

    @GetMapping("/disableUser/{id}")
    void disableUser(@PathVariable int id) {
        userService.disableUser(id);
    }

    @GetMapping("/enableUser/{id}")
    void enableUser(@PathVariable int id) {
        userService.enableUser(id);
    }

    @GetMapping("/makeAdmin/{id}")
    void makeAdmin(@PathVariable int id) {
        userService.makeAdmin(id);
    }
}
