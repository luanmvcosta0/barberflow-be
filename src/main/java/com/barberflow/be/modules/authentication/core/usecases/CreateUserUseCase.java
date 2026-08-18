package com.barberflow.be.modules.authentication.core.usecases;

import com.barberflow.be.modules.authentication.core.entities.User;

public interface CreateUserUseCase {
  
  User execute(User user);
  
}
