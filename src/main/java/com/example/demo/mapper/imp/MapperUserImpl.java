package com.example.demo.mapper.imp;
import com.example.demo.entities.Approval;
import com.example.demo.entities.User;
import com.example.demo.entities.UserDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.example.demo.mapper.MapperUser;
import org.springframework.stereotype.Component;
@Component
public class MapperUserImpl implements MapperUser {

    @Override
    public UserDTO mapToDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPassword( user.getPassword() );
        Set<Approval> list = user.getApprovals();
        if ( list != null ) {
            userDTO.setApprovals( new HashSet<>( list ) );
        }
        return userDTO;
    }

    @Override
    public List<UserDTO> mapToDtoList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( mapToDTO( user ) );
        }

        return list;
    }

    @Override
    public User mapToEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setEmail( userDTO.getEmail() );
        user.setPassword( userDTO.getPassword() );
        Set<Approval> list = userDTO.getApprovals();
        if ( list != null ) {
            user.setApprovals( new HashSet<>( list ) );
        }

        return user;
    }

    @Override
    public List<User> mapToEntityList(List<UserDTO> userDTOS) {
        if ( userDTOS == null ) {
            return null;
        }
        List<User> list = new ArrayList<>( userDTOS.size() );
        for ( UserDTO userDTO : userDTOS ) {
            list.add( mapToEntity( userDTO ) );
        }
        return list;
    }
}
