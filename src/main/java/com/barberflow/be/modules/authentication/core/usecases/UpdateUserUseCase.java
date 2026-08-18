package com.barberflow.be.modules.authentication.core.usecases;

import com.barberflow.be.modules.authentication.core.entities.UserEntity;

public interface UpdateUserUseCase {
  
  UserEntity execute(UserEntity user);

}
