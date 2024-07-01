package com.example.demo.mapper;

import com.example.demo.entities.*;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

public interface MapperUser {
    UserDTO mapToDTO(User user);
    List<UserDTO> mapToDtoList(List<User> users);
    User mapToEntity(UserDTO userDTO);
    List<User> mapToEntityList(List<UserDTO> userDTOS);
}