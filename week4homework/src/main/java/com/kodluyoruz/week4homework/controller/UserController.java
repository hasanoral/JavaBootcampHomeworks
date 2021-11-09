package com.kodluyoruz.week4homework.controller;

import com.kodluyoruz.week4homework.model.dto.UserDto;
import com.kodluyoruz.week4homework.model.request.UserRequest;
import com.kodluyoruz.week4homework.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserRequest request) {
        return service.createUser(request);
    }

    @GetMapping("{id}")
    public UserDto getUser(@PathVariable int id) {
        return service.getUser(id);
    }


    @GetMapping
    public List<UserDto> getUsers(@RequestParam(required = false) String name) {
        return service.getUsers(name);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable int id) {
        service.deleteUser(id);
    }

}
