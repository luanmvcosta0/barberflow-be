package com.barberflow.be.modules.authentication.core.usecases;

import com.barberflow.be.modules.authentication.core.entities.User;
import com.barberflow.be.modules.authentication.core.gateway.UserGateway;

public class FindUserByIdUseCaseImpl implements FindUserByIdUseCase{

  private final UserGateway userGateway;

  public FindUserByIdUseCaseImpl(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  @Override
  public User execute(Long id) {
    return userGateway.findUserById(id)
    .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
  }
  
}
