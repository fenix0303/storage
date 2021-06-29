package testproject.testproject.service;

import testproject.testproject.dto.request.UserData;
import testproject.testproject.dto.response.UserDto;
import testproject.testproject.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserDto create(UserData userData);

    List<User> getAll();

    User getById(UUID id);
}
