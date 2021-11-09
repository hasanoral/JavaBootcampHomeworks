package com.kodluyoruz.week4homework.model.mapper;

import com.kodluyoruz.week4homework.model.dto.UserDto;
import com.kodluyoruz.week4homework.model.entity.User;
import com.kodluyoruz.week4homework.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto toUserDto(User user);

    List<UserDto> toUserDtoList(List<User> users);

    User createUser(UserRequest request);
}
