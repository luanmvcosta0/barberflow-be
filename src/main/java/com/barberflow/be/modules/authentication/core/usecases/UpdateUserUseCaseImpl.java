package com.barberflow.be.modules.authentication.core.usecases;

import java.time.LocalDateTime;

import com.barberflow.be.modules.authentication.core.entities.UserEntity;
import com.barberflow.be.modules.authentication.core.gateway.UserGateway;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase{

  private final UserGateway userGateway;

  public UpdateUserUseCaseImpl(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  @Override
  public UserEntity execute(UserEntity user) {
    var existsUser = userGateway.findUserById(user.getId());
    
    if(existsUser == null) {
      throw new IllegalArgumentException("Usuário não encontrado");
    }

    return userGateway.updateUser(new UserEntity(
      user.getId(),
      user.getFullName(),
      user.getEmail(),
      user.getPassword(),
      user.getCreatedAt(),
      LocalDateTime.now()
    ));

  }
  
}
