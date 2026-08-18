package com.barberflow.be.modules.authentication.core.gateway;

import com.barberflow.be.modules.authentication.core.entities.UserEntity;

public interface UserGateway {
  
  UserEntity createUser(UserEntity user);
  UserEntity findUserById(Long id);
  UserEntity updateUser(UserEntity user);
  UserEntity deleteUser(Long id);

  Boolean existsByEmail(String email);

}
