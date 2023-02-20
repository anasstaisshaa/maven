package edu.anastasiiaTkachuk.service;

import edu.AnastasiiaTkachuk.dao.UserDao;
import edu.AnastasiiaTkachuk.entity.User;
import edu.anastasiiaTkachuk.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
