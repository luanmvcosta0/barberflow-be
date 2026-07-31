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
    this.cpf = validateCpf(cpf);
    this.name = name;
    this.email = validateEmail(email);
    this.password = password;
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }

  private String validateCpf(String cpf) {
    if (cpf == null || cpf.length() !=11) {
      throw new IllegalArgumentException("CPF inválido");
    }

    return cpf;
  }

  private String validateEmail(String email) {
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Email inválido");
    }

    return email;
  }

  public void atualizarDados(String name, String email) {
    this.name = name;
    this.email = validateEmail(email);
    this.updatedAt = LocalDateTime.now();
  }

  public Long getId() {
    return id;
  }

  public String getCpf() {
    return cpf;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }
  
}
