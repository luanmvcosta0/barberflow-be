package com.barberflow.be.modules.authentication.core.usecases;

import java.time.LocalDateTime;

import com.barberflow.be.modules.authentication.core.entities.User;
import com.barberflow.be.modules.authentication.core.gateway.UserGateway;

public class CreateUserCaseImpl implements CreateUserUseCase {

  private final UserGateway userGateway;

  public CreateUserCaseImpl(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  @Override
  public User execute(User user) {

    var existsCountByEmail = userGateway.existsByEmail(user.getEmail());

    if(existsCountByEmail == true) {
      throw new IllegalArgumentException("Email ja cadastrado");
    }

    return userGateway.createUser(new User(
      user.getId(),
      user.getFullName(),
      user.getEmail(),
      user.getPassword(),
      LocalDateTime.now(),
      LocalDateTime.now()
    ));

  }
  
}
