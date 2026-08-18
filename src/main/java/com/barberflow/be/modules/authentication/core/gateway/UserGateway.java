package com.barberflow.be.modules.authentication.core.gateway;

import java.util.Optional;

import com.barberflow.be.modules.authentication.core.entities.User;

public interface UserGateway {
  
  User createUser(User user);
  Optional<User> findUserById(Long id);
  User updateUser(User user);
  User deleteUser(Long id);

  Boolean existsByEmail(String email);

}
