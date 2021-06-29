package testproject.testproject.mapper;

import lombok.experimental.UtilityClass;
import testproject.testproject.dto.request.UserData;
import testproject.testproject.dto.response.UserDto;
import testproject.testproject.entity.User;

@UtilityClass
public class UserMapper {

    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }

    public User toEntity(UserData userData) {
        User user = new User();
        user.setEmail(userData.getEmail());
        user.setFirstName(userData.getFirstName());
        user.setLastName(userData.getLastName());
        return user;
    }
}
