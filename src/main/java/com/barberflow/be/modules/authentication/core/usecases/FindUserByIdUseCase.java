package com.barberflow.be.modules.authentication.core.usecases;

import com.barberflow.be.modules.authentication.core.entities.User;

public interface FindUserByIdUseCase {
  
  User execute(Long id);

}
