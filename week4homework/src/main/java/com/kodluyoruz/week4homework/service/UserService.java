package com.kodluyoruz.week4homework.service;


import com.kodluyoruz.week4homework.model.dto.UserDto;
import com.kodluyoruz.week4homework.model.entity.User;
import com.kodluyoruz.week4homework.model.request.UserRequest;
import com.kodluyoruz.week4homework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.week4homework.model.mapper.UserMapper.USER_MAPPER;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public UserDto createUser(UserRequest request) {
        User user = USER_MAPPER.createUser(request);

        User savedUser = repository.save(user);
        return USER_MAPPER.toUserDto(savedUser);
    }


    public UserDto getUser(int id) {
        User user = getUserEntity(id);
        return USER_MAPPER.toUserDto(user);
    }

    private User getUserEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }


    public List<UserDto> getUsers(String name) {
        if (name != null) {
            return USER_MAPPER.toUserDtoList(repository.findAllByNameContainsOrDescriptionContains(name, name));
        }

        return USER_MAPPER.toUserDtoList(repository.findAll());
    }

    public void deleteUser(int id) {
        repository.deleteById(id);
    }
}
