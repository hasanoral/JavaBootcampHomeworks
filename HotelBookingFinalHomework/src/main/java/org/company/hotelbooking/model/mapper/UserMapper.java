package org.company.hotelbooking.model.mapper;


import org.company.hotelbooking.model.dto.UserDto;
import org.company.hotelbooking.model.entity.User;
import org.company.hotelbooking.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);
    UserDto toUserDto(User User);
    User toDtoUser(UserDto UserDto);
    List<UserDto> toUserDtoList(List<User> Users);

    User createUser(UserRequest request);

    void updateUser(@MappingTarget User User, UserRequest request);
}
