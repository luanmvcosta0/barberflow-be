package com.barberflow.be.modules.authentication.core.usecases;

import com.barberflow.be.modules.authentication.core.entities.UserEntity;

public interface CreateUserUseCase {
  
  UserEntity execute(UserEntity user);
  
}
