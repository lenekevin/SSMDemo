package org.westos.ssm.service;

import org.westos.ssm.model.User;

public interface UserService {
    User getUserById(int userId);
}