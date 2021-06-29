package testproject.testproject.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import testproject.testproject.dto.request.UserData;
import testproject.testproject.dto.response.UserDto;
import testproject.testproject.entity.User;
import testproject.testproject.mapper.UserMapper;
import testproject.testproject.repository.UserRepository;
import testproject.testproject.service.UserService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDto create(UserData userData) {
        User user = userRepository.saveAndFlush(UserMapper.toEntity(userData));
        return UserMapper.toDto(user);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(UUID id) {
        return null;
    }
}
