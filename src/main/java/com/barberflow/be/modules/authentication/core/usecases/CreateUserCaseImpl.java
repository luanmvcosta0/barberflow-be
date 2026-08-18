package com.barberflow.be.modules.authentication.core.usecases;

import java.time.LocalDateTime;

import com.barberflow.be.modules.authentication.core.entities.UserEntity;
import com.barberflow.be.modules.authentication.core.gateway.UserGateway;

public class CreateUserCaseImpl implements CreateUserUseCase {

  private final UserGateway userGateway;

  public CreateUserCaseImpl(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  @Override
  public UserEntity execute(UserEntity user) {

    return userGateway.createUser(new UserEntity(
      user.getId(),
      user.getFullName(),
      user.getEmail(),
      user.getPassword(),
      LocalDateTime.now(),
      LocalDateTime.now()
    ));

  }
  
}
