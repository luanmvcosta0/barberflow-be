package com.barberflow.be.modules.user.core.entity;

import java.time.LocalDateTime;

public class UserEntity {

  private Long id;
  private String cpf;
  private String name;
  private String email;
  private String password;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public UserEntity() {}

  public UserEntity(String cpf, String name, String email, String password) {
    this.cpf = cpf;
    this.name = name;
    this.email = email;
    this.password = password;
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }
  
}
